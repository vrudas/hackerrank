package domains.java.bignumber;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * You are given n real numbers, sort them in descending order! Read data from System.in.
 * <p>
 * Note: You should take input as string, convert it to BigDecimal and print it using
 * System.out.println after sorting without changing anything.
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-bigdecimal">HackerRank | Java | BigNumber | Java BigDecimal</a>
 */
public class JavaBigDecimal {

    /*
        After refactoring to full Java 8 style the code fail in case of
        costils with leading zero value.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<BigDecimal> decimals = IntStream.range(0, n)
                .mapToObj(i -> new BigDecimal(scanner.nextLine()))
                .collect(Collectors.toList());

        decimals.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(bigDecimal -> System.out.println(bigDecimal.toPlainString()));
    }
}