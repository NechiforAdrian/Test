package itschoolS13.extend;

public class ConstructorPractice {

    public static void main(String[] args) {
        Animal cat = new Animal("red", 26, 16);

        System.out.println("Colour:" + cat.colour);
        System.out.println("Age:" + cat.age);
        System.out.println("Height:" + cat.height);

        Animal dog1 = new Animal("yellow", 5, 35);
        Animal dog2 = new Animal("yellow", 3);

        //ThisPractice thisPractice = new ThisPractice(12,22);


    }
}