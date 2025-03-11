package sprint;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmailDomainExtractor {
    public List<String> extractDomains(List<String> emails){
        String regexPattern = "^[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*@[a-z0-9-]+(?:\\.[a-z0-9-]+)*\\.[a-z]{2,}$";
        
        List<String> validDomains = emails.stream()
        .map(String::toLowerCase)
        .filter(email -> email.matches(regexPattern))
        .map(email -> email.split("@")[1])
        .distinct()
        .collect(Collectors.toList());

        return validDomains.isEmpty() ? Collections.emptyList() : validDomains;
    }
}
