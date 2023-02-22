package itschoolS1;

import java.time.LocalDateTime;

public class Test {
   // /*
//Documentation
     // */
    //getUserName
    //VacuumCleaner  (PascalCase)
    public static void main(String[] args) {
        System.out.println("Hello World");

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        Animal animal = new Animal();
        animal.getAnimalName();
        System.out.println(animal.getAnimalName());

        User user = new User();
        user.setEmail("adrian@google.ro");
        System.out.println(user.getEmail());

        User name = new User();
        name.setFirstName("Adrian");
        System.out.println(name.getFirstName());

        User name1 = new User();
        name1.setLastName("Nechifor");
        System.out.println(name1.getLastName());

        User age = new User();
        age.setAge(26);
        System.out.println(age.getAge());





    }
}

class Animal{
    public String getAnimalName(){
        return "Felix";

    }
}
class User{
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}