package sprint;

public class NumberPrinter {
    public void printNums(int num) {
        if (num >= 0) {
            for (int i=0; i<=num;i++){
                System.out.println(i);
            }
        } else {
            System.out.println("Negative numbers are not allowed");
        }
    }
}
