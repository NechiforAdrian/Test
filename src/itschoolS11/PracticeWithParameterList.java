package itschoolS11;

import java.util.ArrayList;
import java.util.List;

public class PracticeWithParameterList {

    public static void main(String[] args) {
        List<String> humanNamesList = new ArrayList<>();
        humanNamesList.add("Maria");
        humanNamesList.add("Razvan");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(23);
        integerList.add(20);

        printListOfString(humanNamesList);
        genericMethod1(10, 23, 54);
        genericMethod2("Adrian","Anamaria");

    }

    public static void genericMethod1(int a, int b, int c) {
        System.out.println("This is the genericMethod1 whit int parameters: " + (a + b + c));
    }

    public static void genericMethod2(String name1, String name2) {
        System.out.println("This is the genericMethod 2 whit String parameters: " + (name1 + " and " + name2));
    }

    public static void printListOfString(List<String> nameValue) {
        for (String name : nameValue) {
            //Type String, What name you want Name, : assign, to nameValue. and is called :  for each inhance
            System.out.println("And this is how we iterate arrayList the type String: " + name);
        }
    }
}
