public class Three {


    public static void main(String[] args) {

        String tag= "p";
        String openTag = "<>";
        String closeTag = "</>";
        String word = "Welcome to Java World";
        StringBuffer resOpen = new StringBuffer(openTag);
        resOpen.insert(1, tag);
        StringBuffer resClose = new StringBuffer(closeTag);
        resClose.insert(1, tag);
        System.out.println(resOpen +word + resClose);

    }
}

