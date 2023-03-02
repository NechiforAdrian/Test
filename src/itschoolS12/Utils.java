package itschoolS12;

import java.util.List;

public class Utils {

    public static int sumOfNumber(int a, int b) {
        return a + b;
    }

    public static void printElementsFromList(List<String> stringElement) {
        for (String element : stringElement) {
            System.out.println(element);
        }
    }
}