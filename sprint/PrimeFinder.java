package sprint;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {
    public static List<Integer> findPrimesUpTo(int limit){
        List<Integer> result = new ArrayList<>();
        if (limit <= 1){
            return result;
        }

        for(int i=2;i<=limit;i++){
            if(isPrime(i)){
                result.add(i);
            }
        }

        return result;
    }
    private static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        double sqrtN = Math.sqrt(num);

        for (int i = 2; i <= sqrtN; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
