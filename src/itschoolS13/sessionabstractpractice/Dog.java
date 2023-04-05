package itschoolS13.sessionabstractpractice;

public class Dog implements Animal , Food {

    public void makeNoise(){
        System.out.println("Dog make noises.");
    }

    public void food() {
        System.out.println("Dog wants to eat.");
    }

}
