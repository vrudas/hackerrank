package domains.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * In this problem you have to add and multiply huge numbers! These numbers are so big that you can't contain them in
 * any ordinary data types like long integer.
 * Use the power of Java's BigInteger class and solve this problem.
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-biginteger">HackerRank | Java | BigNumber | Java BigInteger</a>
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        BigInteger sum = a.add(b);
        BigInteger mul = a.multiply(b);

        System.out.println(sum);
        System.out.println(mul);
    }
}