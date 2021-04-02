package task5;

public class TaskFiveBunchOfContructors {

    int value1;
    double value2;
    boolean value3;
    String value4;

    public TaskFiveBunchOfContructors(){
        System.out.println("no parameters in this contructor");
    }

    public TaskFiveBunchOfContructors(int value1){
        this.value1 = value1; // here 1 parameter is value1
    }
    public TaskFiveBunchOfContructors(int value1, double value2){
        this(value1);
        this.value2 = value2;
    }
    public TaskFiveBunchOfContructors(int value1, double value2, boolean value3){
        this(value1, value2);
        this.value3 = value3;
    }
    public TaskFiveBunchOfContructors(int value1, double value2, boolean value3, String value4){
        this(value1, value2, value3);
        this.value4 = value4;
    }


    public static void main(String[] args) {
        TaskFiveBunchOfContructors FourValuesConstructor = new TaskFiveBunchOfContructors(5,4,true,"values in this contructor");

        System.out.println(FourValuesConstructor.value2 + " " + FourValuesConstructor.value4);
    }
}
