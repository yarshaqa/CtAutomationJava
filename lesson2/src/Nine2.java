import java.util.Arrays;
import java.util.Random;

public class Nine2 {
    public static void main(String[] args) {


        Random randNum = new Random();
        int array[] = new int[100];
        for (int i = 1; i < array.length; i++) {
            array[i] = randNum.nextInt();
        }


        int q;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    q = array[i];
                    array[i] = array[j];
                    array[j] = q;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
