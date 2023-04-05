package codewarsexercise;

public class EvenOrOdd {

    //Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
    public static String even_or_odd(int number) {
        number = number % 2;
        String evenOrOdd = (number == 0) ? "Even" : "Odd";
        return evenOrOdd;
    }
}