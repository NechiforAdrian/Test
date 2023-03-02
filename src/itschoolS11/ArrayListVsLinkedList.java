package itschoolS11;

import java.util.*;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int index = 0; index < 10000000; index++) {
            arrayList.add("a");
            linkedList.add("a");
        }

        //arrayList is dynamic and is fast for: get!!!

        long startTime = System.currentTimeMillis();
        String getArrayValue = arrayList.get(1000000);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList" + (endTime - startTime));

        //linkedList is slowed than arrayList for: get but is faster for: add or remove!!!

        long startTime2 = System.currentTimeMillis();
        String getLinkedValue = linkedList.get(1000000);
        long endTime2 = System.currentTimeMillis();
        System.out.println("LinkedList" + (endTime2 - startTime2));
    }
}
