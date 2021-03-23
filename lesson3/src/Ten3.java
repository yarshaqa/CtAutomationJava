import java.util.ArrayList;
import java.util.Arrays;

public class Ten3 {


    public static void main(String[] args) {

        String hello = "Hello world";
        int[] ascii =new int[hello.length()];

        // Copy character by character into array
        for (int i =0; i < hello.length(); i++) {
            ascii[i] = (int) hello.charAt(i);
        }
        System.out.println(transformIntToChar(ascii));
        ArrayList<Character> a = transformIntToChar(ascii);
        printList(a);
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }

}
