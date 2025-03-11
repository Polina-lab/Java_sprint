package sprint;

public class GCDRecursive {
    public int gcd(int a, int b){
        if (a==0&&b==0) return 0;
        if (a<0) a = -a;
        if (b <0) b = -b;
        if (b==0) return a;

        return gcd(b, a%b);
    }
}
