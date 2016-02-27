package domains.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vrudas on 2/27/2016.
 * @see <a href="https://www.hackerrank.com/challenges/valid-username-checker">HackerRank | Java | Strings | Java Rtegex 3</a>
 */
public class UserNameChecker {
    public static void main(String[] args) {
        String pattern = "^[^\\W\\d][\\w\\d]{7,29}$";
        Pattern r = Pattern.compile(pattern);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String username = in.nextLine();
            Matcher m = r.matcher(username);
            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
