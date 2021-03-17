import java.util.Arrays;

public class Seven {

    public static void main(String[] args) {


        int array[] = new int[10];

        for (int i = 1; i <= 10; ++i) {
            array[i-1] = i;
            System.out.println(i);
        }
        System.out.println(Arrays.toString(array));
        int b =0;
        for(int i=1; i <array.length-1; i++){
            b = b + array[i];

        }
        System.out.println(b);
    }
}
