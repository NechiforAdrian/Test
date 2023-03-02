package itschoolS1.definition;

import java.time.LocalDateTime;

public class Test {
   // /*
//Documentation
     // */
    //getUserName
    //VacuumCleaner  (PascalCase)
    //ctrl+z Undo
    public static void main(String[] args) {
        System.out.println("Hello World");

        LocalDateTime time = LocalDateTime.now();
        System.out.println("Time&Date: " + time);

        AnimalName animal = new AnimalName();
        animal.getAnimalName();
        System.out.println("Animal name: " + animal.getAnimalName());

        UserDetails user = new UserDetails();
        user.setFirstName("Nechifor");
        user.setLastName("Adrian");
        user.setAge(18);
        user.setEmail("adrian@google.ro");
        System.out.println("First name: " + user.getFirstName());
        System.out.println("Last name: " + user.getLastName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Email: " + user.getEmail());


    }
}


