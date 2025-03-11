package sprint;

public class PowerCalculator {
    public int calculatePower(int base, int exponent) {
        int result = 1;
        if (exponent < 0) {
            return base;
        } else if (exponent == 0) {
            return 1;
        }
        for (int i = 0; i < exponent; i++){
            result=result*base;
        }
        return result;
    }
}
