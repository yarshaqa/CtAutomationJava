package task4.classAandB;

public class ClassA {

    public int packagePublic;


    public boolean methodPublic(int packagePrivate) {
        if (packagePrivate < 50) {
            return true;
        }
        return false;
    }

    public ClassA(int packagePublic) {
        this.packagePublic = packagePublic;
    }
}
