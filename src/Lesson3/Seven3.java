import java.util.Arrays;

public class Seven3 {


    public static void main(String[] args) {

        String email = "john_smith@example.com";
        int index = email.indexOf("@");
        String[] login = email.substring(0, index).replace("_", " ").split(" ");
        String name = login[0].substring(0, 1).toUpperCase() + login[0].substring(1);
        String surname = login[1].substring(0, 1).toUpperCase() + login[1].substring(1);
        String domain = email.substring(index+1);
        System.out.println("login is: " + name + " " + surname);
        System.out.println("domain is: " + domain);
    }
}
