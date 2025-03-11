package sprint;

public class SmallestDivisor {
    
    public int smallestDivisor(int number) {
        if (number<0) {
            number=-number;
        }
        int smallest = number;
        for (int i = number; i>1; i--) {
            int check = number%i;
            if (check==0) {
                smallest=i;
            }
        }
        return smallest;
    }
    
}
