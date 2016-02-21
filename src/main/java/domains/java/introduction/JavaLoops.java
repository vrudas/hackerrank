package domains.java.introduction;

import java.util.Scanner;

/**
 * In this problem you will test your knowledge of Java loops. Given three integers a, b, and n, output the following series
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-loops">HackerRank | Java | Introduction | Java Loops</a>
 */
public class JavaLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        String[] inputs = new String[t];

        for (int i = 0; i < t; i++) {
            inputs[i] = scanner.nextLine();
        }

        for (String input : inputs) {
            String[] split = input.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int n = Integer.parseInt(split[2]);

            int sum = a;
            for (int i = 0; i < n; i++) {
                sum += (int) Math.pow(2, i) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
