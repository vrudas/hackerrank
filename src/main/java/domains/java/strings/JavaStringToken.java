package domains.java.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Given a string, find number of words in that string. For this problem a word is defined by a string of one or more english alphabets.
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-string-token">HackerRank | Java | Strings | Java String Token</a>
 */
public class JavaStringToken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        string = string.replaceAll(",|\\.|\\?|!|@|'|_", " ");

        String[] words = string.split(" ");

        List<String> wordsList = Arrays.asList(words)
                .stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println(wordsList.size());
        wordsList.forEach(System.out::println);
    }
}