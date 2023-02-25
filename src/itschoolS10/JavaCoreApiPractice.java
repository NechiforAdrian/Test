package itschoolS10;

public class JavaCoreApiPractice {

    public static void main(String[] args) {
        String animal1 = "cat";
        String animal2 = "Cat";
        String animal3 = "Elephant  ";

        String animal4 = "Rabbit";//is garbage collector because not have any refer
        System.out.println(animal4);
        animal4 = "Dog";//when we create this object
        System.out.println(animal4);

        //System.out.println(animal1.replace("c","b").toUpperCase().trim().substring(1, 2));//A
        //System.out.println(animal1.replace("cat", "dog").toLowerCase().substring(1, 2));//O

        //System.out.println(animal1.charAt(2));
        //System.out.println(animal1.substring(0, 3));
        //System.out.println(animal1.toUpperCase());
        //System.out.println(animal1.toLowerCase());
        //System.out.println(animal1.equals(animal2));
        //System.out.println(animal1.equalsIgnoreCase(animal2)); //non case sensitive
        //System.out.println(animal1.startsWith("ca"));
        //System.out.println(animal1.endsWith("at"));
        //System.out.println(animal3.contains("h")); //case sensitive
        //System.out.println(animal3.replace("t",""));
        //System.out.println(animal4.length());


    }
}
