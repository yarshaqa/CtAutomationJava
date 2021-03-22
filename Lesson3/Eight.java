import java.util.Arrays;

public class Eight {

    public static void main(String[] args) {

        String names = "Den, John, Will, Kate, Adam, Robin";

        String[] namesArr = names.split(", ");

        for (int i = 0; i < namesArr.length; i++) {
            String k = namesArr[i];
            System.out.println(k);
        }
    }


}
