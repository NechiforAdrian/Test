package itschoolS16;

import java.util.ArrayList;
import java.util.List;

public class GenericsPractice {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        String[] stringArray = {"Maria", "Ion"};
        Integer[] intArray = {1, 2};
        someMethod(stringArray);
        someMethod(intArray);
    }

    public static <T> void someMethod(T[] array) {  // Generics Method...
        for (T item : array) {
            System.out.println(item);
        }
    }
}
