package sprint;

public class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number < 1 || number == 0 || number == 1){
            return false;
        }
        //ONE WAY
        // int isEven = number % 2;
        // int isOdd = number % 3;
        // int isFive = number % 5;
        // int isSeven = number % 7;

        // if (isEven == 0 && number != 2) {
        //     return false;
        // } else if (isOdd == 0 && number != 3) {
        //     return false;
        // } else if (isFive == 0 && number != 5) {
        //     return false;
        // } else if (isSeven == 0 && number != 7) {
        //     return false;
        // } else {
        //     return true;
        // }

        //ANOTHER

        double sqrtN = Math.sqrt(number);

        //System.out.println("sqrt "+sqrtN);
        for (int i = 2; i <= sqrtN; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
        
    }
}
