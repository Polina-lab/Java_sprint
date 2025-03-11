package sprint;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2){
        if (str1.length()!=str2.length()){
            return false;
        }
        char[] check1 = str1.toLowerCase().toCharArray();
        char[] check2 = str2.toLowerCase().toCharArray();
        for(char letter : check1){
            boolean found = false;
            for(char ch : check2){
                System.out.println(letter+", "+ch);
                if(ch==letter){
                    found=true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}
