package itschoolS13.extend2;

public class Test extends Dog {

    void makeNoise(){
        super.makeNoise();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.makeNoise();
    }
}
