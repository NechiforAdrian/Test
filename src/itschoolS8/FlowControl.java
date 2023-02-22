package itschoolS8;

public class FlowControl {

    public static void main(String[] args) {
        String name1 = "Andreea";
        String name2 = "Andreea";

        String name3 = new String("Andreea");

        User user1 = new User();
        User user2 = new User();

        user1.setName("Maria");
        user2.setName("Ion");


        System.out.println(name1 == name2);//true  // for primitive or operator special compare
        System.out.println(name1.equals(name2));//true //special for String compare
        //in heap memory == have same bubble and  .equals is in same heap memory but different bubble
    }
}
class User{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

