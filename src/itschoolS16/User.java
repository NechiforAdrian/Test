package itschoolS16;

import java.util.Objects;

public class User {

    private String name;
    private int age;

    private GenderEnum gender;
    private UserGender userGender;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof User user)) {
            return false;
        }
        return name.equals(user.name) && age == user.age;
    }
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        User user = (User) obj;
//        return age == user.age && Objects.equals(name, user.name);
//    }

    @Override
    public int hashCode() {  //that hashcode
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {  // this toString()...
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
