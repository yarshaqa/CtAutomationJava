package taskThree.classAandB;

public class ClassB {


    public ClassB() {
        ClassA newA = new ClassA(32);

        System.out.println(newA.packagePrivate);
        newA.methodPrivate(newA.packagePrivate);
    }
}
