package game;

import java.io.*;
import java.util.*;

public class Feedback {
    private final String secretWord;
    private final Set<Character> remainingLetters;

    public Feedback(String secretWord) {
        this.secretWord = secretWord.toUpperCase();
        this.remainingLetters = new HashSet<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            remainingLetters.add(c);
        }
    }

    public String generateFeedback(String guess) {
        StringBuilder feedback = new StringBuilder("Feedback: ");
        int[] secretLetterCounts = new int[26];
    
        for (char c : secretWord.toCharArray()) {
            secretLetterCounts[c - 'A']++;
        }
    
        char[] feedbackChars = new char[guess.length()];
        String[] feedbackColors = new String[guess.length()];
        
        for (int i = 0; i < guess.length(); i++) {
            char c = guess.charAt(i);
            feedbackChars[i] = c;
    
            if (c == secretWord.charAt(i)) { 
                feedbackColors[i] = "\u001B[32m";
                secretLetterCounts[c - 'A']--;
            }
        }
    
        
        for (int i = 0; i < guess.length(); i++) {
            char c = guess.charAt(i);
            if (feedbackColors[i] == null) {
                if (secretWord.contains(String.valueOf(c)) && secretLetterCounts[c - 'A'] > 0) {
                    feedbackColors[i] = "\u001B[33m";
                    secretLetterCounts[c - 'A']--;
                } else {
                    feedbackColors[i] = "\u001B[37m";
                }
            }
        }
    
        for (int i = 0; i < guess.length(); i++) {
            feedback.append(feedbackColors[i]).append(feedbackChars[i]).append("\u001B[0m");
        }
    
        return feedback.toString();
    }

    public String getRemainingLetters(String guess) {
        StringBuilder remaining = new StringBuilder("Remaining letters: ");

        for (char c : guess.toCharArray()) {
            if (!secretWord.contains(String.valueOf(c))) remainingLetters.remove(c);
        }
        for (char ch : remainingLetters){
            remaining.append(ch).append(" ");
        }
        return remaining.toString().trim();
    }
}
