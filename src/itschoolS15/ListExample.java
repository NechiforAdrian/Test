package itschoolS15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListExample {

    public static void main(String[] args) {
        User userIon = new User();
        userIon.setFirstName("Ion");
        userIon.setLastName("Popescu");
        userIon.setAge(25);

        User userMaria = new User();
        userMaria.setFirstName("Maria");
        userMaria.setLastName("Diaconescu");
        userMaria.setAge(23);

        List<User> userList = new ArrayList<>();
        userList.add(userIon);
        userList.add(userMaria);

        Map<Integer, List<User>> userMap = new HashMap<>();
        userMap.put(1, userList);

        Map<Integer, User> userMap2 = new HashMap<>();
        userMap2.put(1, userIon);


        System.out.println("First user of the list is: " + userList.get(0).getFirstName());

        if (!userList.isEmpty()) {
            for (User user : userList) {
                if (user.getFirstName().equalsIgnoreCase("Ion")) {
                    System.out.println("User Ion was found.");
                }
            }
        }
    }
}