package itschoolS13.extend2;

public class Dog extends Animal {

    void getDogWeight(){

    }

    void makeNoise() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();
    }
}
