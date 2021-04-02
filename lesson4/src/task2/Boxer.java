package task2;

public class  Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        // write your code here
        if (this.age - anotherBoxer.age <=15) {
            if (this.strength > anotherBoxer.strength & this.weight - anotherBoxer.weight >5) {
                return true;
            }
        }
        return false;
    }
}
