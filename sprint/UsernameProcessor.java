package sprint;

import java.util.List;
import java.util.Optional;

public class UsernameProcessor {
    public String findFirstUsername(List<String> names){
        // if (names.size()<1){
        //     return "Anonymous";
        // }
        String firstName = names.stream()
            .map(Optional::ofNullable)
            .findFirst()
            .orElseGet(()->Optional.of("Anonymous"))
            .orElse("Anonymous");

        return firstName;
    }
}
