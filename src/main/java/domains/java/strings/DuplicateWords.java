package domains.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vrudas on 2/21/2016.
 *
 * @see <a href="https://www.hackerrank.com/challenges/duplicate-word">HackerRank | Java | Strings | Java Rtegex 2</a>
 */
public class DuplicateWords {
    public static void main(String[] args) {

        // Very hard test cases and not real world scenario
        String pattern = "(?i)\\b(\\w+)\\b[\\w\\W]*\\b\\1\\b";
        Pattern r = Pattern.compile(pattern, Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while (m.find()) {
                input = input.replaceAll(r.pattern(), "$1");
                findMatch = false;
            }
            System.out.println(input);
            testCases--;
        }
    }
}
