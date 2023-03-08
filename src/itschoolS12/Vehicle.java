package itschoolS12;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private static String brand;
    private String colour;

    public static void main(String[] args) {
        List<String> brandList = new ArrayList<>();
        brandList.add("Ferrari");
        brandList.add("Volkswaggen");

        PracticeWithVariables practice = new PracticeWithVariables();
        practice.genericMethod();

        PracticeWithVariables.printElementsFromList(brandList);
        String.valueOf(234);

        getBrand();

        int sum = Utils.sumOfNumber(2, 4);
    }

    public static String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
