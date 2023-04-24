package itschoolS16;

import java.util.HashSet;
import java.util.Set;

public class Test { //class custom

    public static void main(String[] args) {
        User user1 = new User("Ion", 23); // why we override equals and hashcode
        User user2 = new User("Ion", 23); // because

        System.out.println(user1.equals(user2)); //to implement correctly we need to override

        Set<User> set = new HashSet<>();//to be just one element we need to override a hashcode
        set.add(user1);
        set.add(user2);
        System.out.println(set.size());

        System.out.println(user1); //we get memory reference but if we want see what is inside
        //we need in class user override toString() method.
    }
}
