package itschoolS13.abstractpractice;

public class Bus extends Vehicle {

    void startEngine() {
        System.out.println("The bus engine has started.");
    }

    @Override
    void turnLightsOn() {
        System.out.println("Lights it's on");
    }
}
