package itschoolS4;

public class JavaOperators {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int y = 2;
        int z = --y;
        double x = 3 + 6 * z;
        System.out.println(x);

        int pc = 2;
        int table = --pc;
        double totalPc = 4 + 6 * table;
        System.out.println(totalPc);

        String firstName = "Nechifor";
        String lastName = " Adrian";
        System.out.println(firstName + lastName);

        firstName += lastName;
        System.out.println("Hello my name is: " + firstName);
        for (int i = 0; i < 10; i++) {
            System.out.println("Nechifor Adrian");

        }
    }
}