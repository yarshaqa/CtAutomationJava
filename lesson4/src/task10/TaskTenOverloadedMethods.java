package task10;

public class TaskTenOverloadedMethods {



    static int overloadedMethods(int one, double two){
        return (int) (one + two);
    }

    static String overloadedMethods(String str, int l){
        return (str+l);
    }

}
