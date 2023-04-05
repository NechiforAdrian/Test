package itschoolS8;

public class AdvanceFlowControl2 {
    public static void main(String[] args) {
        String[] cars = {"Logan", "Bmw", "Mercedes"};
        System.out.println("Print index:" + cars[0]);  //Logan

        for(int index = 0; index < cars.length; index++){
            System.out.println("First run:" + cars[index]);
        }

        for(String car : cars){
            System.out.println("Second run:" + car);
        }
    }
}
