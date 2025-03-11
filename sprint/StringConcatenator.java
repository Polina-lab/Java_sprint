package sprint;

public class StringConcatenator {
    public String concatenate(String... args){
        StringBuilder result= new StringBuilder();
        for (String str : args){
            result.append(str);
        }
        return result.toString();
    }
}
