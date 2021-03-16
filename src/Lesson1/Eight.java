package Lesson1;

public class Eight {


    public static void main(String[] args) {

        double[] array = new double[5];
        for (int i = 0; i < array.length; i++) {
            array[i]= i+1;
//                     System.out.println(array[i]);
        }
        double a = array[0];
        double b = array[array.length-1];
        System.out.println(a+ " " + b);


    }
}
