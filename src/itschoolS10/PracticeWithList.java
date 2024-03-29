package itschoolS10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeWithList {

    public static void main(String[] args) {
        int[] numberList = new int[5];
        //looks like       {0, 0, 0, 0, 0}
        //at index         {0, 1, 2, 3, 4}
        numberList[3] = 24;
        for (int number : numberList) {
            System.out.println(number);
        }
        int[] anotherList = {2, 3, 7, 5, 9};
        for (int number : anotherList) {
            System.out.println(number);
        }
    }

    private static void practiceWithMultidimensionalArray() {
        String[][] names = {{"Ioana", "Maria", "Andreea"}, {"George", "Alin", "Andrei"}};
        System.out.println(names[0][0] + names[0][1]);
    }

    private static void practiceWithArrayListOperation() {
        List<String> names = new ArrayList<>();
        names.add("Ioana");
        names.add("Maria");
        System.out.println(names);
        for (String name : names) {
            System.out.println(name);
        }

        String[] dogs = {"Fluffy", "Rex", "Azorel", "Snow"};
        for (String dog : dogs) {
            System.out.println(dog);

        }
        Arrays.sort(dogs);
        System.out.println("After sort---------");
        for (String dog : dogs) {
            System.out.println(dog);
        }
        System.out.println(Arrays.binarySearch(dogs, "Rex"));
        System.out.println(Arrays.binarySearch(dogs, "Fluffy"));
    }

    private static void practiceWithAutoboxingAndUnboxing() {
        int age = 25;//Wrapper class Integer
        Integer integer = age;//autoboxing
        Integer integer1 = Integer.valueOf(age);

        int unboxedAge = integer.intValue();
    }
}