package itschoolS6;

public class ForConstruction {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        //start from 0 //0  1  2  3
        System.out.println(myArray.length);
        System.out.println("Print int from index 1: " + myArray[1]);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("First for... : " + myArray[i]);
        }

        for (int value : myArray) {
            System.out.println("Last for... : " + value);
        }

        String[] stringArray = {"dog", "cat", "horse"};
        //start from 0        //  0      1       2
        System.out.println("Print int from index 1: " + stringArray[0]);


        //find pairs of numbers whit sum = 10
        // Big 0 notation = time and space complexity
        int[] testArray = {1, 2, 3, 8, 4, 7,};
        for (int i = 0; i < testArray.length; i++) {
            for (int y = 0; y < testArray.length; y++) {
                if (testArray[i] + testArray[y] == 10) {
                    System.out.println("This number give us 10: " + testArray[i] + " And " + testArray[y]);

                }
            }
        }
        //find where is the max value from the array
        // array = [1, 5, 3, 9, 8, 15, 4, 3]
    }
}
