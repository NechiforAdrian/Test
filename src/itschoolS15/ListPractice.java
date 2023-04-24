package itschoolS15;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        String[] city = {"Timisoara", "Iasi", "Bucuresti"};
        System.out.println("This is " + city[1] + ".");
        for (int index = 0; index < city.length; index++) {
            if (city[index].equalsIgnoreCase("Timisoara")) {
                System.out.println("Timisoara is on index : " + index);
                break;
            }
        }


        List<String> names = new ArrayList<>();
        names.add("Maria");
        names.add(1, "Adi");
        names.add(2, "Ana");
        System.out.println(names.get(1));
        System.out.println(names);

        //names.remove(0);
        //System.out.println(names);

        for (String name : names) {
            if (name.trim().replace(" ", "").equalsIgnoreCase("maria")) {
                System.out.println("Maria is already in the list!");
            }
        }
    }
}
