package sprint;

public class PositiveEven {
    public boolean isPositiveAndEven(int n) {
        int last = n % 2;
        boolean checkEven = last==0;
        boolean checkPositive = n > 0;
        if (checkEven && checkPositive) {
            return true;
        } else {
            return false;
        }
        
    }
}
