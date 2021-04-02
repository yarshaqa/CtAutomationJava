package task3;

public class TaskThreeCar {

    private static TaskThreeEngine engine = new TaskThreeEngine(); // has - A

    public TaskThreeCar(TaskThreeEngine engine){
        this.engine = engine;
    }


    public static void main(String[] args) {
        TaskThreeWheels wheel = new TaskThreeWheels();

        wheel.printWheelsIsSpinned();  // - USES - A relationships

        engine.engineStarted(true);
    }

}
