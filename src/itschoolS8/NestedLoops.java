package itschoolS8;

import java.lang.module.FindException;

public class NestedLoops {

    public static void main(String[] args) {
                            //simple array
        int[][] complexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

        for (int[] simpleArray : complexArray) {
            for (int index = 0; index < simpleArray.length; index++){
            System.out.print(index + "\t"); // \t print space between number
            }
        }
    }
}
