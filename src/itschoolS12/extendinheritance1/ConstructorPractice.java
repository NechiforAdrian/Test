package itschoolS12.extendinheritance1;

public class ConstructorPractice {

    //The constructor have 3 type Default,No-arg,Parameterized!!!!!!!!!!!!

    public static void main(String[] args) {
        Animal cat = new Animal("red", 26, 16);

        System.out.println("Colour:" + cat.colour);
        System.out.println("Age:" + cat.age);
        System.out.println("Height:" + cat.height);

        Animal dog1 = new Animal("yellow", 5, 35);
        System.out.println("All properties: " + dog1);
        Animal dog2 = new Animal("yellow", 3);
        //System.out.println(dog2);
        ThisPractice thisPractice = new ThisPractice(12,22);
        //System.out.println(thisPractice);


    }
}