package model;

public class UserGame {

    private String username;
    private String secretWord;
    private int attempts;
    private String result;

    public UserGame(String username, String secretWord) {
        this.username = username;
        this.secretWord = secretWord;
        this.attempts = 0;
        this.result = "ongoing";
    }

    public String getUsername() {
        return username;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public int getAttempts() {
        return attempts;
    }

    public void incrementAttempts() {
        this.attempts++;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

