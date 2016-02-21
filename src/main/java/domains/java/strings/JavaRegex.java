package domains.java.strings;

import java.util.Scanner;

/**
 * Write a class called myRegex which will contain a string pattern.
 * You need to write a regular expression and assign it to the pattern such that it can be used
 * to validate an IP address. Use the following definition of an IP address:
 * IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
 * Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-regex">HackerRank | Java | Strings | Java Regex</a>
 */
public class JavaRegex {
    private static final String PATTERN = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(PATTERN));
        }
    }
}

