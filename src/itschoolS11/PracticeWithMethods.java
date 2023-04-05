package itschoolS11;

public class PracticeWithMethods {

    public static void main(String[] args) {
        String name = getName();
        System.out.println("Name value is: " + name);
        printSumNumber(10, 15);
    }

    public static String getName() {
        String someName = "George";
        return someName;
    }


    public static void printSumNumber(int a, int b) {
        System.out.println("And number is: " + (a + b));
    }


}
