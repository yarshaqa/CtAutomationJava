package task7;

import java.util.Random;

public class TaskSevenInitializationBlock{

    public static int count = 0;
    private int id;
    public static int nextId;
    double fieldFirst;
    String fieldSecond;
    {// this is dynamic initialization block
        count++;
        nextId++;
        id = nextId;
    }

    static {//here is static initialization block, using once at first time of code running
        Random rand = new Random();
        nextId = rand.nextInt(1000);
    }
    public TaskSevenInitializationBlock (double fieldFirst, String fieldSecond){
        this.fieldFirst = fieldFirst;
        this.fieldSecond = fieldSecond;
    }
    public int getId(){
        return this.id;
    }
}