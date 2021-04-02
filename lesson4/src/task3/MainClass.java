package task3;

public class MainClass {

    public static void main(String[] args) {
        TaskThreeWheels wheel = new TaskThreeWheels();
        TaskThreeEngine engine = new TaskThreeEngine();
        TaskThreeCar car = new TaskThreeCar(engine);

        wheel.printWheelsIsSpinned();  // - USES - A relationships

        engine.engineStarted(true);
    }

}
