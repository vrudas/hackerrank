package domains.java.introduction;

import java.util.Scanner;

/**
 * In this problem you just need to read the inputs from stdin and print them in stdout.
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-output-formatting">HackerRank | Java | Introduction | Java Output Formatting</a>
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lang1 = scanner.nextLine().split(" ");
        String[] lang2 = scanner.nextLine().split(" ");
        String[] lang3 = scanner.nextLine().split(" ");

        printEq();
        printf(lang1[0], lang1[1]);
        printf(lang2[0], lang2[1]);
        printf(lang3[0], lang3[1]);
        printEq();
    }

    private static void printEq(){
        System.out.printf("================================\n");
    }

    private static void printf(String lang, int langInt) {
        System.out.printf("%-15s%03d\n", lang, langInt);
    }

    private static void printf(String lang, String langStr) {
        printf(lang, Integer.parseInt(langStr));
    }
}
