package itschoolS12.something;

public class Animal {

    String colour;
    int age;
    int height;

    public Animal(String colour) {
        this.colour = colour;
    }

    public Animal(String colour, int age){
        this.colour = colour;
        this.age = age;

       if(age < 5){ //validation
           System.out.println("Animal is too young, need be more then 5!");
       }
    }

    public Animal(String colour, int age, int height) {
        this.colour = colour;
        this.age = age;
        this.height = height;
    }
}
