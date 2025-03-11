package sprint;

public class NumberComparator {
    public String whichIsGreater(int n, double f) {
        if (n>f) {
            return "Integer";
        } else if (f>n) {
            return "Float";
        } else {
            return "Same";
        }
        
    }
}
