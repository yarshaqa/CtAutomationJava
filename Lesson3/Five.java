public class Five {


    public static void main(String[] args) {

        String a = "ABCDEFGHIJK";
        String b = a.toLowerCase();
        String c = b.replaceAll("([a, e, i, o, u])", "");
        System.out.println(c);

    }
}
