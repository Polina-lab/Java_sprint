package sprint;

public class DigitSum {
    public static int sumOfDigits(int number) {
        int sum = 0;
        char[] numbers = String.valueOf(number).toCharArray();

        for (char num : numbers){
            int i = Character.getNumericValue(num);
            if (i<0) {
                i=0;
            }
            sum+=i;
        }

        return sum;
    }
}
