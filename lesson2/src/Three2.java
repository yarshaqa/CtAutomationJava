import java.util.Random;

public class Three2 {


    public static void main(String[] args) {

        int array[] = new int[10];
        Random randNum = new Random();
        for (int i = 0; i <= array.length-1; i++){
            array[i] = randNum.nextInt();
            System.out.println(array[i]);
        }
    }
}
