package task4.classC;

import task4.classAandB.ClassA;

public class ClassC {

    ClassA newAinC = new ClassA(32);

    public void main(String[] args) {

        System.out.println(newAinC.packagePublic);
        newAinC.methodPublic(newAinC.packagePublic);
    }
}
