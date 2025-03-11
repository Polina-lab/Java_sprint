package io;

import java.io.*;
import model.UserGame;

public class StatsManager {

    public void writeStatsToCSV(UserGame userGame, String secretWord) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("stats.csv", true))) {
            writer.append(userGame.getUsername()).append(",")
                  .append(secretWord).append(",")
                  .append(String.valueOf(userGame.getAttempts())).append(",")
                  .append(userGame.getResult()).append("\n");
        } catch (IOException e) {
            System.out.println("Error writing to stats file: " + e.getMessage());
        }
    }

    public void viewStats(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader("stats.csv"))) {
            String line;
            boolean foundStats = false;
            int won=0;
            float total=0;
            int count=0;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                
                if (data[0].equals(username)) {
                    foundStats = true;
                    if(data[3].equals("win")) won++;
                    count++;
                    total=total+Integer.parseInt(data[2]);

                }
            }
            if (!foundStats) {
                System.out.println("No stats found for user: " + username);
            } else {
                System.out.println("Stats for " +username+ ":\nGames played: " + count + "\nGames won: " + won + "\nAverage attempts per game: " + (float) (Math.round(total/count)));
            }
        } catch (IOException e) {
            System.out.println("Error reading from stats file: " + e.getMessage());
        }
    }
}
