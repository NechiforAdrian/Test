package itschoolS18;

import java.util.*;
import java.util.logging.Filter;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        filter();
        map();
        flatMap();//intermediate method
        distinct();
        sort();

        forEach();
        reduce();
        conte();//terminal method
        anyMatch();
        collect();
        filterMapCollect();
        flatMapDistinct();
        filterSortForEach();
    }

    static void filterSortForEach() {
        List<User> userList = Arrays.asList(
                new User("Alice", 23),
                new User("Bob", 34),
                new User("David", 21),
                new User("Charlie", 40));
        userList.stream()
                .filter(user -> user.getAge() > 30)
                .sorted(Comparator.comparing(User::getName))
                .forEach(user -> System.out.println(user.getName()));
    }

    static void flatMapDistinct() {
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2, 5), Arrays.asList(2, 3, 4), Arrays.asList(5, 6, 1));
        long count = numbers.stream()
                .flatMap(Collection::stream)//
                .distinct() //removes duplicates
                .count();  // count elements
        System.out.println(count);

    }

    static void filterMapCollect() {
        List<String> names = Arrays.asList("Alina", "Anton", "Maria", "Alexandru", "Bogdan");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }

    static void collect() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7);
        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);
    }

    static void anyMatch() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 2, 5, 6, 7, 5);
        boolean hasEvenNumbers = numbers.stream() //terminal operation
                .anyMatch(number -> number % 2 == 0);
        System.out.println(hasEvenNumbers);
    }

    static void conte() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        long count = numbers.stream().count();// terminal operator
        System.out.println(count);
    }

    static void reduce() {
        List<Integer> numbers = Arrays.asList(1, 2, 3); //a is 1 + b is 2 = 3 + a is 3 now + b is 3...
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b); //terminal operation
        System.out.println(sum);
        List<Integer> numbers2 = Arrays.asList(1, 2, 3);
        int multiply = numbers.stream() //same here
                .reduce(1, (a, b) -> a * b); //terminal operation 0 * 0 is 0  1from identity
        System.out.println(multiply);// is whit how i multiply the number he can be 2 3 or...
    }

    static void forEach() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 2, 5, 6, 7, 5);
        numbers.stream()
                .forEach(System.out::println); //terminal operation

    }

    //sort a stream based on a comparator
    static void sort() {
        List<String> words = Arrays.asList("Hello", "world", "how", "are", "you?");
        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(sortedWords);

    }

    static void distinct() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 2, 5, 6, 7, 5);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct() // intermediate operation
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);
    }

    static void flatMap() {
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> flattenedNumbers = numbers.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());                 // Example to extract whit stream!
        System.out.println(flattenedNumbers);

        List<Integer> extractedNumbers = new ArrayList<>();
        for (List<Integer> numberList : numbers) {
            for (Integer number : numberList) {                 //Example to extract whit for!
                extractedNumbers.add(number);
            }
        }
        System.out.println("Extracted numbers: " + extractedNumbers);
    }

    //
    static void map() {
        List<String> words = Arrays.asList("Hello", "world", "how", "are", "you?");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(wordLengths);
    }

    //filter a stream based on a predicate
    static void filter() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumber = numbers.stream()
                .filter(num -> num % 2 == 0)//intermediate operation
                .collect(Collectors.toList());//terminal operation
        System.out.println(evenNumber);
    }
}
