package sprint;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLengthAnalyzer {
    public Map<Integer, Integer> analyzeWordLengths(List<String> words) {
        Map<Integer, Integer> result = words.stream()
            .collect(Collectors.groupingBy(word -> word.length(), Collectors.summingInt(e -> 1)));

        return result;

    }
}
