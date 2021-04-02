package taskEight;

public class GetterAndSetter {

    private int dell;
    private double asus;
    private String apple;
    private int samsung;
    private boolean fromUSA;


    public int getDell(){
        return dell;
    }
    public double getAsus(){
        return asus;
    }
    public String getApple(){
        return apple;
    }
    public int getSamsung(){
        return samsung;
    }
    //setters
    public void setDell(int dell){
        this.dell=dell;
    }
    public void setAsus(int asus){
        this.asus=asus;
    }
    public void setApple(String apple){
        this.apple=apple;
    }
    public void setSamsung(int samsung) {
        this.samsung = samsung;
    }
    //boolean
    public boolean isFromUSA() {
        return fromUSA;
    }
}
