import java.lang.Math;

public class Two2 {

    public static void main(String[] args) {

        double sideA = 5.15;

        double rectanguleSquare = Math.pow(sideA, 2);
        double circleSquare = Math.PI * Math.pow(sideA, 2);
        System.out.println("Square of rectangular (where sides = 5.15) is: " + rectanguleSquare);
        System.out.println("Square of circle (where sides = 5.15) is: " + circleSquare);

    }
}
