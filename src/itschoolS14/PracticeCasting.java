package itschoolS14;

public class PracticeCasting {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = (int) doubleValue;
        System.out.println(intValue);

        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Max double value: " + maxDoubleValue);
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Max int value: " + maxIntValue);
        int maxDoubleConverted = (int) maxDoubleValue;
        System.out.println("Double converted to int: " + maxDoubleConverted);

    }
}
