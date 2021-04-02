package taskFour.classC;

import taskFour.classAandB.ClassA;

public class ClassC {

    ClassA newAinC = new ClassA(32);

    public void main(String[] args) {

        System.out.println(newAinC.packagePublic);
        newAinC.methodPublic(newAinC.packagePublic);
    }
}
