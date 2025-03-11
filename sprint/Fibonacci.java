package sprint;

public class Fibonacci {
    public int calculateFibonacci(int n) {
        if (n<0){
            return -1;
        }
        if (n==0||n==1) {
            return n;
        }

        int result=calculateFibonacci(n-1)+calculateFibonacci(n-2);

        return result;
    }
}
