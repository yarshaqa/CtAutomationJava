package task4.classAandB;

public class ClassB {

    ClassA newA = new ClassA(60);

    public void main(String[] args) {

        System.out.println(newA.packagePublic);
        newA.methodPublic(newA.packagePublic);
    }
}
