package itschoolS12;

public class Practice {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Volkswaggen");
        vehicle.setColour("Blue");

        System.out.println("Vehicle brand is: " + vehicle.getBrand());
        System.out.println("Vehicle color is: " + vehicle.getColour());
    }
}
