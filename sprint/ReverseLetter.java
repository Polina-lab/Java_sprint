package sprint;

public class ReverseLetter {
    public char reverseLetter(char ch) {
        char result = (char) ('z' - (ch - 'a'));
        return result;
    }
    
}
