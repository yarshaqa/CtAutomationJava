import java.lang.Math;
import java.util.Arrays;

public class Four2 {
    public static void main(String[] args) {

        int array[] = new int[10];

        for (int i = 1; i <= array.length-1; i++) {
            array[i] = (int) Math.pow(i, 2);

//            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));

    }

}
