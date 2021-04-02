package task10;

import static task10.TaskTenOverloadedMethods.overloadedMethods;

public class MainClass {

    public static void main(String[] args) {
        int a = overloadedMethods(4,3);
        System.out.println(a);

        String b = overloadedMethods("overloaded method #", 2);
        System.out.println(b);
    }

}
