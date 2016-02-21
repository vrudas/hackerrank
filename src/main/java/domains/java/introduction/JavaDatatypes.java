package domains.java.introduction;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Given an integer number, you have to determine which of these datatypes you can use to store that number.
 * If there are multiple suitable datatypes, list them all in the order above.
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-datatypes">HackerRank | Java | Introduction | Java Datatypes</a>
 */
public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = scanner.nextInt();

        ArrayList<Number> numbers = new ArrayList<>(numberCount);
        for (int i = 0; i < numberCount; i++) {
            numbers.add(Long.parseLong(scanner.next()));
        }

        numbers.forEach(number -> {
            if (number.intValue() > Integer.MIN_VALUE && number.intValue() < Integer.MAX_VALUE) {
                System.out.println(number + " can be fitted in:");
            }
            if (number instanceof Byte) {
                System.out.println(" * byte");
            } else if (number instanceof Short) {
                System.out.println(" * short");
            } else if (number instanceof Integer) {
                System.out.println(" * int");
            } else if (number instanceof Long) {
                System.out.println(" * long");
            } else {
                System.out.println("can't be fitted anywhere.");
            }
        });
    }
}
