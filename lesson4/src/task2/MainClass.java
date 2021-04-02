package task2;

public class MainClass {


    public static void main(String[] args) {

        Boxer boxer1 = new Boxer(40, 90, 23);

        Boxer boxer2 = new Boxer(20, 75, 20);

        boolean a = boxer1.fight(boxer2);
        System.out.println("will boxer1 win the box? - " + a);
    }

}
