package task9;

public class TaskNineRecursion {

    static int factorial(int x) {
        if (x == 2) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
}