package task6;

import static task6.taskSixPrivateConstructor.methodCreatePrivateConstructor;

public class MainClass {

    public static void main(String[] args) {
        taskSixPrivateConstructor a = methodCreatePrivateConstructor(221);
        System.out.println(a.a);
    }
}
