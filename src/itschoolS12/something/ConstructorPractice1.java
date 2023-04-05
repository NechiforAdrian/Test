package itschoolS12.something;

public class ConstructorPractice1 {

    public static void main(String[] args) {
        Animal dog = new Animal("White");
        System.out.println("Dog, colour:" + dog.colour);

        Animal horse = new Animal("Brown", 4);
        System.out.println("Horse, colour:" + horse.colour);
        System.out.println("Horse, age:" + horse.age);


        Animal cat = new Animal("red", 32, 12);
        System.out.println("Cat, colour:" + cat.colour);
        System.out.println("Cat, age:" + cat.age);
        System.out.println("Cat, height:" + cat.height);

        ConstructorPractice constructorPractice = new ConstructorPractice();
        // We create a object /     whit a default constructor

    }
}
