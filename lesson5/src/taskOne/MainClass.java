package taskOne;

import taskOne.taskOne1.TaskOneSameNameLesson5;


public class MainClass {

    static taskOne.taskOne2.TaskOneSameNameLesson5 One = new taskOne.taskOne2.TaskOneSameNameLesson5(3,4,"success");


    static TaskOneSameNameLesson5 Second = new TaskOneSameNameLesson5(54, 54, 54);



    public static void main(String[] args) {
        One.budget = 23;
        System.out.println(One.str);
        System.out.println(One.budget);

        Second.rating = 88;
        System.out.println(Second.str);
    }


}
