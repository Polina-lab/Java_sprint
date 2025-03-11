package sprint;

public class Accumulator {
    public int accumulate(int n) {
        int sum=0;
        if (n>0) {
            for (int i=0; i<=n;i++){
                sum+=i;
            }
        }
        return sum;
    }
}
