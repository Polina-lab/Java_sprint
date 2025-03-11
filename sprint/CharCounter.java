package sprint;

public class CharCounter {
    public int countOccurrences(String input, char target) {
        String temp = String.valueOf(target).toLowerCase();
        target = temp.charAt(0);
        
        char[] letters = input.toLowerCase().toCharArray();
        int count = 0;

        for (char letter : letters) {
            if (letter == target) {
                count++;
            }
        }

        return count;
    }
}
