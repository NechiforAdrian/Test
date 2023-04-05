package codewarsexercise;

public class SquareSum {

    public static void main(String[] args) {

        int[] myArray = {1,2,2};
        int[] anotherArray = {3, 5, 6};

        squareSum(myArray,3);

        System.out.println(squareSum(myArray,3) + squareSum(anotherArray,4));

    }

    private static int  squareSum(int[] myArray,int x) {
        int sum = 0;
        int i = 0;
        while(i < myArray.length){
            sum += Math.pow(myArray[i],x);
            i++;
        }

        return sum;
    }

}
