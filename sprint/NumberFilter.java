package sprint;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class NumberFilter {

    private List<Integer> numbers;

    public NumberFilter(int count, long seed) {
        this.numbers = generateRandomNumbers(count, seed);
    }

    private List<Integer> generateRandomNumbers(int count, long seed) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random(seed);
        for (int i = 0; i < count; i++) {
            randomNumbers.add(random.nextInt(2001) - 1000);
        }
        return randomNumbers;
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> getAllPrimeNumbers() {
        List<Integer> primes = new ArrayList<>();
        for (int num : numbers) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    public List<Integer> getDivisibleBy3ButNot5() {
        List<Integer> divisibleBy3Not5 = new ArrayList<>();
        for (int num : numbers) {
            if (num % 3 == 0 && num % 5 != 0) {
                divisibleBy3Not5.add(num);
            }
        }
        return divisibleBy3Not5;
    }

    public List<Integer> getSortedRemainingNumbers() {
        List<Integer> remainingNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 3 != 0 && num % 5 != 0) {
                remainingNumbers.add(num);
            }
        }
        remainingNumbers.sort((a, b) -> Integer.compare(b, a));
        return remainingNumbers;
    }

    public double computeAverageOfRemainingNumbers() {
        List<Integer> remainingNumbers = getSortedRemainingNumbers();
        if (remainingNumbers.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int num : remainingNumbers) {
            sum += num;
        }
        return sum / remainingNumbers.size();
    }

    public static void main(String[] args) {
        NumberFilter numberFilter = new NumberFilter(100, 42);
        
        System.out.println("Prime Numbers: " + numberFilter.getAllPrimeNumbers());
        System.out.println("Divisible by 3 but not 5: " + numberFilter.getDivisibleBy3ButNot5());
        System.out.println("Sorted remaining numbers: " + numberFilter.getSortedRemainingNumbers());
        System.out.println("Average of remaining numbers: " + numberFilter.computeAverageOfRemainingNumbers());
    }
}
