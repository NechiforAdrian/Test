package itschoolS17;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PracticeLambda {

    public static void main(String[] args) {
        //The Consumer
        Consumer<String> printer = (message) -> System.out.println(message);
        printer.accept("Hello World!");

        //The Supplier
        Supplier<Integer> randomGeneratedNumber = () -> new Random().nextInt(100);
        int randomNumber = randomGeneratedNumber.get();
        System.out.println(randomNumber);

        //The function
        Function<String, String> upperCaseConverter = (str) -> str.toUpperCase();
        String message = "Hello world again!";
        String upperCaseMessage = upperCaseConverter.apply(message);
        System.out.println(upperCaseMessage);

        //The Predicates
        Predicate<Integer> isGreaterThan10 = (number) -> number > 10;
        int numberToCompare = 20;
        System.out.println(isGreaterThan10.test(numberToCompare));
    }
}
