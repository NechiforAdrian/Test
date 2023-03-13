package itschoolS14.sessionabstractpractice;

public class Cat implements Animal , Food {

    @Override
    public void makeNoise(){
        System.out.println("Cat make noises.");
    }
    public void food(){
        System.out.println("Cat want eat.");
    }

}
