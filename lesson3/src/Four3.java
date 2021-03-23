public class Four3 {

    public static void main(String[] args) {

        String word1 = "The End";
        String word2="End The";
        String expectedStart = "The";

        System.out.println(word1.startsWith(expectedStart));
        System.out.println(word2.startsWith(expectedStart));

    }

}
