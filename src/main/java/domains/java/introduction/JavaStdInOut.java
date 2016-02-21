package domains.java.introduction;

import java.util.Scanner;

/**
 * In this problem you just need to read the inputs from stdin and print them in stdout.
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-stdin-stdout">HackerRank | Java | Introduction | Java Stdin and Stdout</a>
 */
public class JavaStdInOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt();
        double nextDouble = scanner.nextDouble();

        /*
        scanner.nextDouble() reads just the double number and not the end of line after it,
        and hence a spare scanner.nextLine()
        */
        scanner.nextLine();
        String nextString = scanner.nextLine();

        System.out.println("String: " + nextString);
        System.out.println("Double: " + nextDouble);
        System.out.println("Int: " + nextInt);
    }
}
