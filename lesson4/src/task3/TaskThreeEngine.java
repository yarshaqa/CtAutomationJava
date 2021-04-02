package task3;

public class TaskThreeEngine {



    boolean engineIsWorking;
    public void engineStarted(boolean engineIsWorking) {
        if (engineIsWorking){
            System.out.println("User can drive a car");
        }
        else System.out.println("Car cannot be driven");
    }

}
