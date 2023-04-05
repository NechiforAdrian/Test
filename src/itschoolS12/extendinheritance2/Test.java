package itschoolS12.extendinheritance2;

public class Test extends Dog {

    void makeNoise(){
        super.makeNoise();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.makeNoise();
        test.getDogWeight();
    }
}
