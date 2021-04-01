public class TaskTenOverloadedMethods {



    static int overloadedMethods(int one, double two){
        return (int) (one + two);
    }

    static String overloadedMethods(String str, int l){
        return (str+l);
    }

    public static void main(String[] args) {
        int a = TaskTenOverloadedMethods.overloadedMethods(4,3);
        System.out.println(a);

        String b = overloadedMethods("overloaded method #", 2);
        System.out.println(b);
    }

}
