package sprint;

import java.util.List;
import java.util.stream.Collectors;

public class StringToIntConverter {
    public List<Integer> convertStringListToIntList(List<String> stringList){
        List<Integer> result = stringList.stream()
        .map(str -> Integer.parseInt(str))
        .collect(Collectors.toList());

        return result;
    }
}
