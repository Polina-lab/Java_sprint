package sprint;

public class RecursivePalindrome {
    public boolean isPalindrome(String str) {
        if (str==null) return false;
        if (str.isEmpty()) return true;
        String formatted = str.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        return isPalindromeHelper(formatted, 0, formatted.length()-1);
    }

    private boolean isPalindromeHelper(String str, int start, int end) {
        if (start>=end) return true;
        if (str.charAt(start)!=str.charAt(end)) return false;
        else return isPalindromeHelper(str, start+1, end-1);
    }
}
