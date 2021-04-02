package taskSix;

class taskSixPrivateConstructor {

    int a = 10;
    private taskSixPrivateConstructor(int a){
        this.a = a;
    }

    public static taskSixPrivateConstructor methodCreatePrivateConstructor(int a){

        return new taskSixPrivateConstructor(a);
    }

}
