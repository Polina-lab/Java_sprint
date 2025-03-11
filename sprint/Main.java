package sprint;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //first task
        //GiveMeThree solutionClassInstance = new GiveMeThree();
        //System.out.println(solutionClassInstance.returnThree());

        //second task
        //Calculator calculator = new Calculator();
        //System.out.println(calculator.add(2,2));

        //third task
        //FloatMinusInt solutionClass = new FloatMinusInt();
        //System.out.println(solutionClass.subtractIntFromDoubleAndReturnDouble(29.233139038085938, 48));
        //System.out.println(solutionClass.subtractIntFromDoubleAndReturnInt(29.233139038085938, 48));

        //third task
        //MultiplyAndTell solutionClassInstance = new MultiplyAndTell();
        //System.out.println(solutionClassInstance.printMult2Concat(4));

        //4th task
        //AverageCalculator ac = new AverageCalculator();
        //System.out.println(ac.calculateAverage(4.0f, 5.0f, 6.0f));

        //5th task
        //StrConcat sc = new StrConcat();
        //System.out.println(sc.concatWithDelimiter("kood", "School", '/'));

        //6th task
        //AsciiAdder aa = new AsciiAdder();
        //System.out.println(aa.addAscii('z', -1));

        //7th task
        //ReverseLetter rl = new ReverseLetter();
        //System.out.println(rl.reverseLetter('a'));

        //8th taks
        //SignPost sgp = new SignPost();
        //System.out.println(sgp.getArea("It works on my machine"));

        //SECOND grage
        //Negative
        //IsNegative solutionClass = new IsNegative();
        //System.out.println(solutionClass.checkIfNegative(-5));
        //System.out.println(solutionClass.checkIfNegative(5));

        //Positive Even
        //PositiveEven solutionClass = new PositiveEven();
        //System.out.println(solutionClass.isPositiveAndEven(2));
        //System.out.println(solutionClass.isPositiveAndEven(5));

        //Number Comparator
        //NumberComparator solutionClass = new NumberComparator();
        //System.out.println(solutionClass.whichIsGreater(2, 3.0));
        //System.out.println(solutionClass.whichIsGreater(5, 4.9999999));
        //System.out.println(solutionClass.whichIsGreater(5, 5.0));

        //Calculat Basic
        //BasicCalc solutionClass = new BasicCalc();
        //System.out.println(solutionClass.doOperation(10, '/', 2));
        //System.out.println(solutionClass.doOperation(10, '/', 0));

        //Between Limits
       //BetweenLimits solutionClass = new BetweenLimits();
        //System.out.println(solutionClass.findRange('f', 'j'));
        //System.out.println(solutionClass.findRange('j', 'f'));

        //Printer
        //NumberPrinter printer = new NumberPrinter();
       //printer.printNums(5);
        //printer.printNums(-3);

        //Accumutator
        //Accumulator accumulator = new Accumulator();
        //System.out.println(accumulator.accumulate(4));
        //System.out.println(accumulator.accumulate(-3));

        //Converter
        //Converter converter = new Converter();
        //System.out.println(converter.atoi("4"));
        //System.out.println(converter.itoa(4));

        //MICRO problems
        //DigitSum
        //int number = 383473847;
        //int result = DigitSum.sumOfDigits(number);
        //System.out.println(result);

        //Letter Lens
        //String input = "HOllo WorldoHo    !5858o";
        //char target = 'O';
        //CharCounter charCounter = new CharCounter();
        //int count = charCounter.countOccurrences(input, target);
        //System.out.println(count);

        //Prime Finder
        //int number = 11;
        //boolean isPrime = PrimeChecker.isPrime(number);
        //System.out.println(number+" is prime: "+isPrime);

        //Power Play
        //PowerCalculator powerCalculator = new PowerCalculator();
        //int result = powerCalculator.calculatePower(5, 3);
        //System.out.println("Power Play "+result);

        //Divisor Discovery
        //SmallestDivisor smallestDivisor = new SmallestDivisor();
        //int result = smallestDivisor.smallestDivisor(-47);
        //System.out.println(result);

        //Word Tally
        //WordCounter wordCounter = new WordCounter();
        //String sentence = "^&*()*&^%&*";
        //int wordCount = wordCounter.countWords(sentence);
        //System.out.println(wordCount);

        //GCD
        //GCDCalculator gcdCalculator = new GCDCalculator();
        //int result = gcdCalculator.gcd(12, 12);
        //System.out.println(result);

       /* int[] testValues = {1, 2, 7, 14, 45};

        for (int n : testValues) {
            System.out.println("Tree for n = " + n + ":");
            Tree.tree(n);
            System.out.println();
        }*/

        /*Test test = new Test();
        System.out.println(test.isBalanced(""));
        System.out.println(result);*/

       
        //CypherTool.main(args);

        /*ArrayInitializer initializer = new ArrayInitializer();
        int[] result = initializer.fillArray(5);
        for (int num : result) {
            System.out.print(num + " ");
        }*/

        /*int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = ArrayAdder.concatArrays(arr1, arr2);

        for (int num : result) {
            System.out.print(num + " ");
        }*/

        /*List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ListManipulator listManipulator = new ListManipulator();
        list = listManipulator.manipulateList(list);
        System.out.println(list);*/

        /*List<Double> list = new ArrayList<>();
        list.add(1.5);
        list.add(2.5);
        list.add(3.5);
        list.add(4.5);
        list.add(5.5);

        List<Double> result = ArrayModifier.removeElementsBetween(list, 1, 3);

        for (double num : result) {
            System.out.print(num + " ");
        }*/

        /*StringConcatenator stringConcatenator = new StringConcatenator();
        String result = stringConcatenator.concatenate("Hello", ", ", "varArgs", "!");
        System.out.println(result);*/

        /*int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {1, 1, 1}
        };

        ArrayFilter arrayFilter = new ArrayFilter();
        int[][] filteredArray = arrayFilter.filterBySum(array, 10);

        for (int[] row : filteredArray) {
            System.out.println(Arrays.toString(row));
        }*/

        /*ArraySorter sorter = new ArraySorter();
        double[] unsorted = {5.5, 2.2, 8.8, 1.1, 3.3};
        double[] sorted = sorter.sortArray(unsorted);
        for (double num : sorted) {
            System.out.print(num + " ");
        }*/

        //Combinations comb = new Combinations();
        //System.out.println(comb.combN(3));

        /*StreamPolice processor = new StreamPolice();
        List<Integer> numbers = Arrays.asList(-10, 15, 20, 30, 8, -3, 5, 10, 50, 12);
        List<Integer> result = processor.processNumbers(numbers);
        System.out.println(result);*/

        /*StringToIntConverter converter = new StringToIntConverter();
        List<String> input = Arrays.asList("23", "45", "-15");
        List<Integer> result = converter.convertStringListToIntList(input);
        System.out.println(result);*/

        /*UsernameProcessor processor = new UsernameProcessor();
        //List<String> usernames = Arrays.asList("usr", "user12", "test", "validUser", "12345");
        List<String> usernames = Arrays.asList("");
        String firstUsername = processor.findFirstUsername(usernames);
        System.out.println(firstUsername); */

        /*NumberProcessor processor = new NumberProcessor();
        List<Integer> numbers = Arrays.asList(3, 5, 12, 20, 7, 10);

        //result = processor.processNumbers(numbers);
        System.out.println(processor.processNumbers(numbers));*/

        /*EmailDomainExtractor extractor = new EmailDomainExtractor();
        List<String> emails = Arrays.asList(
                "USER1@EXAMPLE.COM",
                "user2@@Example.com",
                "user1@@EXAMPLE.COM",
                "user3@@SAMPLE.ORG",
                "INVALIDEMAIL@",
                "user4@@SAMPLE.ORG"
        );
        List<String> domains = extractor.extractDomains(emails);
        domains.forEach(System.out::println);*/

        /*WordLengthAnalyzer analyzer = new WordLengthAnalyzer();
        Map<Integer, Integer> result = analyzer.analyzeWordLengths(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        System.out.println(result);*/

        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 9);
        CustomIterator iterator = new CustomIterator(numbers);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

       /*  double squareArea = AreaCalculator.calculateArea(5);
        System.out.println("Area of square: " + squareArea);

        double rectangleArea = AreaCalculator.calculateArea(5, 10);
        System.out.println("Area of rectangle: " + rectangleArea);

        double circleArea = AreaCalculator.calculateArea(7, true);
        System.out.println("Area of circle: " + circleArea);

        double invalidCircleArea = AreaCalculator.calculateArea(7, false);
        System.out.println("Area of circle boolean=false: " + invalidCircleArea);*/

        /*LocalDate weekdayDate = LocalDate.of(2024, 8, 26);
        LocalDate weekendDate = LocalDate.of(2024, 8, 31);
        LocalDate wednesdayDate = LocalDate.of(2024, 9, 4);
        System.out.println(DayChecker.checkDayType(weekdayDate));
        System.out.println(DayChecker.checkDayType(weekendDate));
        System.out.println(DayChecker.checkDayType(wednesdayDate));*/

        /*String testString1 = "A man, a plan, a canal, Panama";
        String testString2 = "Hello, World!";
        System.out.println(PalindromeChecker.isPalindrome(testString1));
        System.out.println(PalindromeChecker.isPalindrome(testString2));*/

        /*String string1 = "Listen";
        String string2 = "Silent";
        String string3 = "Hellou";
        System.out.println(AnagramChecker.areAnagrams(string1, string2));
        System.out.println(AnagramChecker.areAnagrams(string1, string3));*/

        /*int limit = 30;
        List<Integer> primes = PrimeFinder.findPrimesUpTo(limit);
        System.out.println(primes);*/

        /*LocalDate startDate = LocalDate.of(2024, 8, 1);
        LocalDate endDate = LocalDate.of(2024, 8, 31);
        WeekendCalculator calculator = new WeekendCalculator();
        long weekendDayCount = calculator.countWeekendDays(startDate, endDate);
        System.out.println(weekendDayCount);*/

        /*int[] nums = {3, 1, 4, 1, 5};
        int[] reuslt = Transformer.transform(nums); 
        System.out.println(Arrays.toString(reuslt));*/

        //System.out.println(CalendarBuilder.buildCalendar("May", 1993));

        /*Factorial calculator = new Factorial();
        System.out.println(calculator.calculateFactorial(5));
        System.out.println(calculator.calculateFactorial(-3));*/

        /*Fibonacci calculator = new Fibonacci();
        System.out.println(calculator.calculateFibonacci(6));
        System.out.println(calculator.calculateFibonacci(-3));*/

        /*GCDRecursive calculator = new GCDRecursive();
        System.out.println(calculator.gcd(48, 18));
        System.out.println(calculator.gcd(100, 75));*/

        /*RecursivePalindrome checker = new RecursivePalindrome();
        System.out.println(checker.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(checker.isPalindrome("race a car"));
        System.out.println(checker.isPalindrome(""));
        System.out.println(checker.isPalindrome("a"));
        System.out.println(checker.isPalindrome("   "));
        System.out.println(checker.isPalindrome(null));*/

        /*OccurrenceCounter counter = new OccurrenceCounter();
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        System.out.println(counter.countOccurrences(arr, 2, 0));
        System.out.println(counter.countOccurrences(arr, 6, 0));
        System.out.println(counter.countOccurrences(null, 1, 0));
        System.out.println(counter.countOccurrences(new int[]{}, 1, 0));*/

        /*ParenthesesBalanceChecker checker = new ParenthesesBalanceChecker();
        System.out.println(checker.isBalanced("(())"));
        System.out.println(checker.isBalanced("(a()b()c)"));
        System.out.println(checker.isBalanced("(()"));
        System.out.println(checker.isBalanced(")("));
        System.out.println(checker.isBalanced(""));
        System.out.println(checker.isBalanced(null));*/

        /*int[] arr = {1,20,-3,4,5,-6,7,8,10,34,12,5,2,2};
        System.out.println(Chunks.search(arr, 5));*/
        //int test = 00001;
        //System.out.println(test);

        WeatherStation weatherStation = new WeatherStation();
        System.out.println(weatherStation.getState() + "\n");

        weatherStation.updateState("1,21.6\n2,31\n7,0.4\n11,0\n12,NULL\n13,9.1\n14,12.3\n15,33.2\n22,1008");
        weatherStation.updateState("131,32.3");
        weatherStation.updateState("1,21.8\n2,30.9\n7,0.3\n11,0.1\n12,0.2\n13,9.3\n14,12.5\n15,33.3\n22,1018");
        System.out.println(weatherStation.getState() + "\n");

        // weatherStation.updateState("11,15.7\n13,33.1");
        // System.out.println(weatherStation.getState() + "\n");

        // weatherStation.clearState();
        // System.out.println(weatherStation.getState() + "\n");

    }
}