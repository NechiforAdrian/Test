package itschoolS12.extendinheritance2;

public class Dog extends Animal {

    void getDogWeight(){
        System.out.println("Dog weight is 7kg");
    }

    void makeNoise() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();
        dog.getDogWeight();

        Cat cat = new Cat();
        cat.getAnimalColour();
        cat.makeNoise();

    }
}
