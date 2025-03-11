package sprint;

public class PalindromeChecker {
    public static boolean isPalindrome(String str){
        String formatted = str.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        int delimiter = formatted.length()/2;
        String part1 = formatted.substring(0,delimiter);
        String part2 = formatted.substring(formatted.length()-delimiter);
        String part2Reverse="";
        for (int i=part2.length()-1;i>=0;i--){
            part2Reverse+=part2.charAt(i);
        }
        if (part1.equals(part2Reverse)){
            return true;
        }
        return false;
    }
}
