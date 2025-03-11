package sprint;

import java.util.ArrayList;

public class WordCounter {
    public int countWords(String sentence) {
        String[] words = sentence.split(" ");
        ArrayList<String> onlyWords = new ArrayList<String>();
        for (String word : words) {
            if (word.matches(".*[a-zA-Z].*")){
                onlyWords.add(word);
            }
        }
        int count = onlyWords.size();
        return count;
    }
}
