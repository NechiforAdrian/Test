package itschoolS6;

import static itschoolS6.PracticeOperators.USER_CNP;

public class PracticeOperators {
    private double bankAccount;

    //constants are always written whit caps lock like SOME_THING

    public static String USER_CNP = "2982735987619857";


    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y) {
            //code
        }
        short ab = 34;
        int a = 10;
        long b = 15;
        long c = a * b;
    }

    public void getName() {

    }
}

class Test {
    static int age = 10;

    public static void main(String[] args) {
        String test = USER_CNP;
        PracticeOperators practiceOperators = new PracticeOperators();
        practiceOperators.getName();

        if (true) {
            System.out.println("hello");
        }
        if (age > 18) {
            System.out.println("hello");
        } else if(false) {
            System.out.println("bye");
        } else if(false) {
            //
        }else if (true){
            //
        }else {
            //
        }

        int horsePower = 250;
        int result = horsePower < 100 ? horsePower + 10 : horsePower - 10;
        System.out.println(result); // 240

        String raceResult = horsePower < 100 ? "stop race" : "start race";

        String raceResult2;
        if (horsePower < 100){
           raceResult2 = "stop race";
        }else{
            raceResult2 = "start race";
        }

    }

    public int computeTwoNumbers(int a, int b) {
        return a + b;
    }
}

class AnotherTest {
    //that's the heap memory: we can access all public methods from class Test in this class.
    // class AnotherTest is just declare not created because we need to do that to create: AnotherTest anotherTest = new AnotherTest();
    //now we have another circle in heap memory
    //we can use garbage collector to delete ex: test = null; now test from down is not anymore definite.
    public static void main(String[] args) {
        Test test = new Test();
        //ex: test = null;
        System.out.println(test.computeTwoNumbers(10, 20));
        AnotherTest anotherTest = new AnotherTest();
        String test1 = "Anamaria";

        String test2 = "Adrian";//string pool bubble
        String test3 = "Adrian";//string pool bubble
        String test4 = new String("Adrian");//another string pool bubble

        System.out.println(test1 == test4);//false
        System.out.println(test2 == test3);//true
        System.out.println(test1 == test2);//false
        System.out.println(test1.equals(test2));//false
    }
}
