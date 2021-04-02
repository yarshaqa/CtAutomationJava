package task11;

public class MyClass {

    static int staticField = 100;
    int dynamicField = 15;


    public MyClass (int staticField, int dynamicField){

    }

    static void change(int value) { // we can not change dynamic fields in static methods;
        MyClass.staticField = value;
        System.out.println(MyClass.staticField);
    }

    void anotherChange(int value) {  // we can change dynamic methods in any methods (static/dynamic);
        MyClass.staticField = value+10;
        dynamicField = value;
        System.out.println(MyClass.staticField);
        System.out.println(dynamicField);

    }
}
