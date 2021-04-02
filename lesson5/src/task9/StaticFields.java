package task9;

public class StaticFields {

    public static int staticField = 12;
    public int nonStaticField;
    double nonStaticDouble;

    public StaticFields (int staticField, int nonStaticField, double nonStaticDouble) {
        StaticFields.staticField = staticField;
        this.nonStaticDouble=nonStaticDouble;
        this.nonStaticField=nonStaticField;
        //staticField that using in constructor is usable for class, not for each separate instance;
    }



}
