package itschoolS12;

import java.util.List;

public class PracticeWithVariables {

    String name = "Marius"; //Instance variables

    public static String colour = "red"; // static variables

    public void genericMethod() {
        int age = 10; //Local Variables
    }

    public static void printElementsFromList(List<String> stringElement) {
        for (String element : stringElement) {
            System.out.println(element);
        }


    }
}
