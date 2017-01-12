package domains.java.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class'
 * getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats.
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-currency-formatter">HackerRank | Java | Introduction | Java Currency Formatter</a>
 */
public class JavaCurrencyConverter {

    private static final Locale INDIA_LOCALE = new Locale.Builder().setLanguage("en")
                                                                   .setRegion("IN")
                                                                   .build();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = getFormattedPayment(payment, Locale.US);
        String india = getFormattedPayment(payment, INDIA_LOCALE);
        String china = getFormattedPayment(payment, Locale.CHINA);
        String france = getFormattedPayment(payment, Locale.FRANCE);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    private static String getFormattedPayment(double payment, Locale locale) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return numberFormat.format(payment);
    }
}
