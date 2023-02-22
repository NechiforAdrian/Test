package itschoolS9;

public class AdvanceFlowControl2 {
    public static void main(String[] args) {
        String[] cars = {"Logan", "Bmw", "Mercedes"};
        System.out.println(cars[0]);  //Logan

        for(int index = 0; index < cars.length; index++){
            System.out.println(cars[index]);
        }

        for(String car : cars){
            System.out.println(car);
        }
    }
}
