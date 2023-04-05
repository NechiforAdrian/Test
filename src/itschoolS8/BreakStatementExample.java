package itschoolS8;

public class BreakStatementExample {

    public static void main(String[] args) {
        //find indexes for searchValue on complexArray
        int[][] complexArray = {{3, 2, 1}, {3, 4, 6}, {8, 5, 2}};
        //                                    1,1
        int searchValue = 4; //if we change  the number4    to 6 then,number  8
        int positionX = 0;//is the position at array       1       1,             2
        int positionY = 0;//is the position at array       1,      2,             0

        OUTER_LOOP:for(int i = 0; i < complexArray.length; i++) {
            for (int j = 0; j < complexArray[i].length; j++) {
                if (complexArray[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    System.out.println(positionX + " " + positionY);
                    break OUTER_LOOP;
                }
                if (positionX == 0 || positionY == 0) {
                    System.out.println("Value " + searchValue + " was not found");
                }
            }
        }
    }
}



