import java.util.Arrays;

public class SixA {

    public static void main(String[] args) {


        String a = "*";
        String array[] = new String[8];
        for (int i =0; i <=8; i++){
            for (int j = 0; j <8; j++){
                array[j] = a;
            }
//            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.asList(array).toString().substring(1).replaceFirst("]", "").replace(", ", "")

            );

        }

    }

}
