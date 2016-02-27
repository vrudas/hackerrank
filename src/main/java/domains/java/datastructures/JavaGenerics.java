package domains.java.datastructures;

import java.lang.reflect.Method;

/**
 * Created by vrudas on 2/27/2016.
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-generics">HackerRank | Java | Strings | Java Generics</a>
 */
public class JavaGenerics {
    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name.equals("printArray"))
                count++;
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");
        assert count == 1;

    }
}

class Printer {
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
