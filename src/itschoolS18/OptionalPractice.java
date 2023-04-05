package itschoolS18;

import java.util.Optional;
import java.util.Random;

public class OptionalPractice {

    public static void main(String[] args) {
//        String name = getName();
//        System.out.println(name.equals("Other value")); //possible null pointer exception

        Optional<String> optionalName = Optional.ofNullable(getName());
//        if(optionalName.isPresent()){
//            System.out.println("We have a name"); //first
//        }else{
//            System.out.println("Value is null");
//        }
//        String someString = optionalName.get();
//        System.out.println(someString.equals("Other value"));  //second

        String name = optionalName.orElse("Default"); // third
//        System.out.println(name);

        Optional<Integer> optionalLength = optionalName.map(String::length);
        System.out.println(optionalLength.orElse(0));

        User user = null; // null pointer exception ( shortcut NPE )
        user.setName(null);
        System.out.println(user.getName());

    }

    static String getName() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (randomNumber == 0) {
            return "Some Value";
        } else {
            return null;
        }
    }
}
