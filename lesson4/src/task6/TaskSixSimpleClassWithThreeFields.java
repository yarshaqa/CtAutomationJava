package task6;

public class TaskSixSimpleClassWithThreeFields {

    int fieldOne;
    double fieldTwo;
    String fieldThree;


    TaskSixSimpleClassWithThreeFields(int One, double Two, String Three) {
        fieldOne = One;
        fieldTwo = Two;
        fieldThree = Three;
    }



    public static void main(String[] args) {
        TaskSixSimpleClassWithThreeFields simple = new TaskSixSimpleClassWithThreeFields(5, 4, "three");
        System.out.println(simple.fieldOne);
    }


}
