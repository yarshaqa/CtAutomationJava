package task4;

public class TaskFourStaticCalculator {

    double firstValue;
    double secondValue;
    String operation;

    public TaskFourStaticCalculator() {
        System.out.println("You have to initialize 2 values type \"double\" to calculate");
    }

    public TaskFourStaticCalculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public void calculate() {
        switch (operation) {
            case "+" :
                System.out.println(firstValue + secondValue);
            case "-" : System.out.println(firstValue - secondValue);
            case "*" :
                System.out.println(firstValue * secondValue);
            case "/" :
                System.out.println(secondValue != 0 ? firstValue / secondValue : "Second value should be other than \"0\"");
            default :
                System.out.println(0);
        };
    }

}
