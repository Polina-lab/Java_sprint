package sprint;

public class GCDCalculator {
    public int gcd(int a, int b) {
        int biggest = 1;

        if (b==0) return a;
        if (a==0) return b;
        

        if (a>b) {
            for (int i = biggest; i <= b; i++) {
                int checkFirst = b % i;
                int checkSecond = a % i;
                if (checkFirst==0 && checkSecond==0) biggest = i;
            }
        } else {
            for (int i = biggest; i <= a; i++) {
                int checkFirst = b % i;
                int checkSecond = a % i;
                if (checkFirst==0 && checkSecond==0) biggest = i;
            }
        }

        return biggest;
    }
}
