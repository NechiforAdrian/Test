package codewarsexercise;

public class InvertValues {

    public static void main(String[] args) {

        int[] myArray = {2, 4, -1, -6};
        invert(myArray);
        System.out.println(String.valueOf(invert(myArray)));

    }


    public static int[] invert(int[] array) {

        for(int i = 0; i < array.length; i++){
            array[i] = array[i] * -1;

        }

        return array;
    }
}
