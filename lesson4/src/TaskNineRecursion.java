public class TaskNineRecursion {

    static int factorial(int x) {
        if (x == 2) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(TaskNineRecursion.factorial(5));
    }
}