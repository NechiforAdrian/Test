package itschoolS12.extendinheritance1;

public class ThisPractice {

    //Practice whit  this.

    int age;
    int height;

    public ThisPractice(int age){
        this.age = age;
        System.out.println("first constructor was called");
    }
    public ThisPractice(int age, int height){
        this.age = age;
        this.height = height;
    }

    void getName(){
    }
    void getAge(){
        this.getName();
    }
}
