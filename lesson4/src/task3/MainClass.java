package task3;

public class MainClass {

    public static void main(String[] args) {
        TaskThreeWheels wheel = new TaskThreeWheels();

        wheel.printWheelsIsSpinned();  // - USES - A relationships

        TaskThreeCar.engine.engineStarted(true);
    }

}
