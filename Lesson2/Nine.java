import java.util.Arrays;
import java.util.Random;

public class Nine {
    public static void main(String[] args) {


        Random randNum = new Random();
        int array[] = new int[100];
        for (int i =1; i <array.length; i++){
            array[i] = randNum.nextInt();
        }
        System.out.println(Arrays.toString(array));


    }

//    public static int[] lookForBiggerNumbers(int arr[])
//    {
//        for(int i = 0; i<arr.length; i++){
//            if (arr[i]< arr[i+1]){
//
//            }
//        }
//
//    }
}
