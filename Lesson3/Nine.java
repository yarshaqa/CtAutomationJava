import java.util.Arrays;

public class Nine {


    public static void main(String[] args) {

        String noPoint = "Verify if that string ends with dot.";

        String[] varToArray = noPoint.split("");

        if (".".equals(varToArray[varToArray.length-1])){
            System.out.println("Tested String is: " + noPoint);
        }
        else {
            noPoint = noPoint + ".";
            System.out.println(noPoint);
        }

        System.out.println("the last symbol in the string was: " + "\"" + varToArray[varToArray.length-1] +"\"");
        System.out.println("Current String is: " + noPoint);
    }
}
