package itschoolS8;

public class PracticeWithStrings {

    public static void main(String[] args) {
        String animal = "Elephant";
        System.out.println(animal.length());                              //ctrl plus click to object documentation
        for(int index = 0; index < animal.length(); index++){
            animal.indexOf(animal.indexOf(index));
            System.out.println(index);
            System.out.println(animal.charAt(index));
            System.out.println(animal.substring(0, 3));
            System.out.println(animal.substring(3));
            String user = "adi@gmail.com   ";
            System.out.println(user.trim());
        String userInput = "AdriaN@gmail.com    ";
        String userInputPrepared = userInput.trim().toLowerCase();
        System.out.println("User prepared: " + userInputPrepared);

        String userSavedOnDatabase = "adrian@gmail.com";
        if (userInputPrepared.equals(userSavedOnDatabase)){
            System.out.println("Welcome to the app!");

        }
        }
    }
}// do not forget...to
