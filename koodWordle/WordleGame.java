import java.util.*;
import java.io.*;

import io.WordLoader;
import game.Wordle;

public class WordleGame {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("Please provide a number as command line argument");
            return;
        }
        if(args.length!=1){
            System.out.println("Usage: You need to run java WorgleGame.java [word-index], where word-index - the number of word");
            return;
        }
        int wordIndex;
        try{
            wordIndex = Integer.parseInt(args[0]);
        } catch (NumberFormatException e){
            System.out.println("Invalid command-line argument. Please launch with a valid number");
            return;
        }
        List<String> words;
        try{
            WordLoader wordLoader = new WordLoader("wordle-words.txt");
    	    words = wordLoader.loadWords();
        } catch (IOException e){
            System.out.println("Could not load words file.");
            return;
        }
        if (words.isEmpty()){
            System.out.println("Word list is empty.");
            return;
        }

        if (wordIndex < 0 || wordIndex >= words.size()) {
            System.out.println("Invalid command-line argument. Please launch with a valid number");
            return;
        }

        String secretWord = words.get(wordIndex);
        Scanner scanner = new Scanner(System.in);
        System.out.println(secretWord);
        Wordle game = new Wordle(secretWord, scanner);
        game.play();
        scanner.close();


    }
}
