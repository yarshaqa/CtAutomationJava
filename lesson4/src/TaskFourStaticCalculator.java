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
        double result;

        if (operation.equals("+")) {
            result = firstValue + secondValue;
            System.out.println(result);
        }
        if (operation.equals("-")) {
            result = firstValue - secondValue;
            System.out.println(result);
        }
        if (operation.equals("*")) {
            result = firstValue * secondValue;
            System.out.println(result);
        }
        if (operation.equals("/")) {
            if (secondValue != 0) {
                result = firstValue / secondValue;
                System.out.println(result);
            } else System.out.println("Second value should be other than \"0\"");
        } else {
            System.out.println("You can use only next type of operations : +, -, *, /");
        }
    }

}
