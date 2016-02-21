package domains.java.strings;

import java.util.Scanner;

/**
 * @see <a href="https://www.hackerrank.com/challenges/java-strings-introduction">HackerRank | Java | Strings | Java strings introduction</a>
 */
public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        System.out.println((a + b).length());
        System.out.println(a.compareTo(b) >= 1 ? "Yes" : "No");
        System.out.println(toUpperCaseFirstLetter(a) + " " + toUpperCaseFirstLetter(b));
    }

    private static String toUpperCaseFirstLetter(String string) {
        String firstLetter = string.substring(0, 1)
                .toUpperCase();

        return firstLetter + string.substring(1);
    }

}