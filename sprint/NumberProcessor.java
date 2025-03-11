package sprint;

import java.util.List;
import java.util.Optional;

public class NumberProcessor {
    public Optional<Integer> processNumbers(List<Integer> numbers){
        Optional<Integer> result = numbers.stream()
            .filter(num -> num>=10)
            .reduce((sum, num) -> sum * num);
        return result;
    }
}
