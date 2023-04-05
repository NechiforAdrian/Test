package itschoolS14;

public class PracticeWithOverloading {

    public static void main(String[] args) {
        System.out.println("First sum: " + sum(2,10));
        System.out.println("Second sum: " + sum(2,10,20));

        char someChar = 'a';
        long someLong = 242452;
        System.out.println(String.valueOf(someChar));//this is grey because sout(print line)
        System.out.println(String.valueOf(someLong));// make this convert to string by default
    }

    public static int sum(int a, int b) {
        return a + b; //we need to make static to call in main because main is static
    }
    public static int sum(int a, int b, int c) {
        return a + b + c; //this is method overloading
    }
}
