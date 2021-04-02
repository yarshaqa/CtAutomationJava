package task3.classAandB;

class ClassA {
    int packagePrivate;


    boolean methodPrivate(int packagePrivate){
        if (packagePrivate<50){
            return true;
        } return false;
    }

    ClassA (int packagePrivate){
        this.packagePrivate = packagePrivate;
    }

}
