package domains.java.introduction;

import java.util.Scanner;

/**
 * Sometimes you don't know how many lines are there in a file and you need to read the file until EOF or End-of-file.
 * In this problem you need to read a file until EOF and print the contents of the file.
 * You must take input from stdin(System.in).
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-end-of-file">HackerRank | Java | Introduction | Java EOF</a>
 */
public class JavaEOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (scanner.hasNext()) {
            i++;
            System.out.println(i + " " + scanner.nextLine());
        }
    }
}