package domains.java.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Today we will learn about java strings.
 * Your task is simple, given a string, find out the lexicographically smallest and largest substring of length k.
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-strings">HackerRank | Java | Strings | Java strings</a>
 */
public class JavaStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int k = scanner.nextInt();

        List<String> subStrings = new ArrayList<>();
        while (!input.isEmpty() && input.length() >= k) {
            String substring = input.substring(0, k);
            subStrings.add(substring);

            int newLength = input.length() - 1;
            input = input.substring(input.length() - newLength);
        }

        String min = subStrings.stream()
                .min(String::compareTo)
                .get();
        String max = subStrings.stream()
                .max(String::compareTo)
                .get();

        System.out.println(min);
        System.out.println(max);
    }
}