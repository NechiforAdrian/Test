package itschoolS15;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

    public static void main(String[] args) {
        Map<Integer, String> mapValues = new HashMap<>();
        mapValues.put(999249, "Timisoara");
        mapValues.put(999250, "Cluj-Napoca");

        System.out.println("Integer + String,from mapValue: " + mapValues);

        int[] zipcode = {232323, 344343};
        String[] cities = {"Timisoara", "Cluj"};
        Map<Integer, String> zipcodeCityMap = new HashMap<>();
        for (int i = 0; i < zipcode.length; i++) {
            if (i <= cities.length) {
                zipcodeCityMap.put(zipcode[i], cities[i]);
            }
        }
        System.out.println("Merged arrays: " + zipcodeCityMap);

        for (Map.Entry<Integer, String> entry : mapValues.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            if (value.equalsIgnoreCase("Cluj-Napoca")) {
                System.out.println("Cluj-Napoca was found.");
            }
        }
    }
}
