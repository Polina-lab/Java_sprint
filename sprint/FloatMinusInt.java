package sprint;

public class FloatMinusInt {
    public double subtractIntFromDoubleAndReturnDouble(double floating, int integer) {
        double result = floating - integer;
        return result;
    }

    public int subtractIntFromDoubleAndReturnInt(double floating, int integer) {
        int result = (int) ((int)floating - integer);
        return result;
    }
}
