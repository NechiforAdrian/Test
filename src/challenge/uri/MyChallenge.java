package challenge.uri;

public class MyChallenge {

    public static void main(String[] args) {
      int testArray[] = {1, 5, 3, 9, 8, 15, 4, 3};
      int maxValue = testArray [0];
      int maxValueI = 0;
      for(int i = 0; i < testArray.length; i++){
          if (testArray[i] > maxValue){
              maxValue = testArray[i];
              maxValueI = i;

          }
      }
        System.out.println("This is the max: " + maxValue);
        System.out.println("And the index is located at: " + maxValueI);
    }
}
