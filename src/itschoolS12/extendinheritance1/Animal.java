package itschoolS12.extendinheritance1;

public class Animal {

    String colour;
    int age;
    int height;

    public Animal(String colour){
        this.colour = colour;
    }
    public Animal(String colour,int age){
        this("blue");
        this.colour = colour;
        this.age = age;

        if(age < 5);
        System.out.println("Animal is too young!");

    }
    public Animal(String colour, int age, int height){
        this.colour = colour;
        this.age = age;
        this.height = height;

    }
}