package task11;

public class MainClass {

    public static void main(String[] args) {
        MyClass.change(13); // we can use static methods only for classes (not for instances);

        MyClass b = new MyClass (30,40);

        b.anotherChange(22); // here we can use dynamic methods for instances only;

    }
}
