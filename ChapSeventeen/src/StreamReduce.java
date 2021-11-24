import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
//        Sum of numbers from 1 to 10
        System.out.printf("Sum of 1 through 10 is: %d%n",
                IntStream.rangeClosed(1, 10)
                        .sum());

//        Multiple and Sum
        System.out.println((IntStream.rangeClosed(1, 10)
                .map((int x) -> {return x * 2;})
                .sum()));

        System.out.println(IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .sum());


        SecureRandom randomNumbers = new SecureRandom();
// display 10 random integers on separate lines
        System.out.println("Random numbers on separate lines:");
        randomNumbers.ints(10, 1, 7)
                .forEach(System.out::println);
// display 10 random integers on the same line
        String numbers = randomNumbers.ints(10, 1, 7)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "));

        System.out.printf("%nRandom numbers on one line: %s%n", numbers);




        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
// display original values
        System.out.print("Original values: ");
        System.out.println(
                IntStream.of(values)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));
// count, min, max, sum and average of the values
        System.out.printf("%nCount: %d%n", IntStream.of(values). count() );
        System.out.printf("Min: %d%n",
                IntStream.of(values). min().getAsInt() );
        System.out.printf("Max: %d%n",
                IntStream.of(values). max().getAsInt() );
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
        System.out.printf("Average: %.2f%n",
                IntStream.of(values). average().getAsDouble() );
// sum of values with reduce method
        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values)
                        . reduce(0, (x, y) -> x + y) );
// product of values with reduce method
        System.out.printf("Product via reduce method: %d%n",
                IntStream.of(values)
                        . reduce((x, y) -> x * y).getAsInt() );
// sum of squares of values with map and sum methods
        System.out.printf("Sum of squares via map and sum: %d%n%n",
                IntStream.of(values)
                        .map(x -> x * x)
                        .sum());

        System.out.printf("Values displayed in sorted order: %s%n",
                IntStream.of(values)
                        .sorted()
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));



        Integer[] numero = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
// display original values
        System.out.printf("Original values: %s%n", Arrays.asList(numero));

        System.out.printf("Sorted values: %s%n",
                Arrays.stream(numero)
                        .sorted()
                        .collect(Collectors.toList()) );
// values greater than 4
        List<Integer> greaterThan4 =
                Arrays.stream(numero)
                        .filter(num -> num > 4)
                        .collect(Collectors.toList());
        System.out.printf("Values greater than 4: %s%n", greaterThan4);
// filter values greater than 4 then sort the results
        System.out.printf("Sorted values greater than 4: %s%n",
                Arrays.stream(numero)
                        .filter(num -> num > 4)
                        .sorted()
                        .collect(Collectors.toList()) );
// greaterThan4 List sorted with streams
        System.out.printf(
                "Values greater than 4 (ascending with streams): %s%n",
                greaterThan4.stream()
                        .sorted()
                        .collect(Collectors.toList()) );






        String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
// display original strings
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));
// strings in uppercase
        System.out.printf("strings in uppercase: %s%n",
                Arrays.stream(strings)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList()));
// strings less than "n" (case-insensitive) sorted ascending
        System.out.printf("strings less than n sorted ascending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList()));
// strings less than "n" (case-insensitive) sorted descending
        System.out.printf("strings less than n sorted descending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));
    }
}
