package game;

import java.util.*;
import java.io.*;

import java.util.Scanner;
import model.UserGame;
import io.StatsManager;
import io.WordLoader;

public class Wordle {
    private final String secretWord;
    private final Scanner scanner;
    private final int maxAttempts;

    public Wordle(String secretWord, Scanner scanner){
        this.secretWord = secretWord;
        this.scanner = scanner;
        this.maxAttempts = 6;
    }

    public void play() {
        System.out.println("Welcome to Wordle! Guess the 5-letter word.");
        System.out.print("Enter your username: ");
        String userName = scanner.nextLine().toLowerCase().trim();
        UserGame userGame = new UserGame(userName, secretWord);
        StatsManager statsManager = new StatsManager();
        
        //int attempts = 0;
        Feedback feedback = new Feedback(secretWord);

        List<String> words;
        try{
            WordLoader wordLoader = new WordLoader("wordle-words.txt");
            words = wordLoader.loadWords();
        } catch (IOException e){
            System.out.println("Could not load words file.");
            return;
        }

        while(userGame.getAttempts() < maxAttempts){
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();
            if (guess.length() != secretWord.length()) {
                System.out.println("Your guess must be exactly 5 letters long");
                continue;
            }

            if (guess.matches(".*[A-Z].*")||!guess.matches("[a-z]{5}")){
                System.out.println("Your guess must only contain lowercase letters");
                continue;
            }

            if (!words.contains(guess)){
                System.out.println("Word not in list. Please enter a valid word.");
                continue;
            }

            userGame.incrementAttempts();

            if (secretWord.equals(guess)){
                userGame.setResult("win");
                System.out.println("Congratulations! You've guessed the word correctly.");
                break;
            }

            
            String feedbackMessage = feedback.generateFeedback(guess.toUpperCase());
            System.out.println(feedbackMessage);
            System.out.println(feedback.getRemainingLetters(guess.toUpperCase()));

            System.out.println("Attempts remaining: "+(int)(maxAttempts-userGame.getAttempts()));
            
        }

        if (!userGame.getResult().equals("win")) {
            System.out.println("Game over. The correct word was: " + secretWord);
            userGame.setResult("loss");
        }

        statsManager.writeStatsToCSV(userGame, secretWord);

        System.out.print("Do you want to see your stats? (yes/no):");
        while(true){
            String stats = scanner.nextLine().toLowerCase().trim();
            if (stats.equals("yes")){
                statsManager.viewStats(userGame.getUsername());
                break;
            } else if (stats.equals("no")){
                System.out.println("bye!");
                break;
            } else {
                System.out.println("You need to input only yes or no.");
                continue;
            }
        }

        System.out.println("Press Enter to exit...");
        scanner.nextLine();
        scanner.close();
        
    }
}
