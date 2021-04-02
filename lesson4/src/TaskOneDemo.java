import java.sql.SQLOutput;

public class TaskOneDemo {

    public static void main(String[] args) {


        TaskOneCreateClassHuman human = new TaskOneCreateClassHuman(43,23,"Yar", "Sh", 333);

        human.weight = 90.50;
        human.age = 27;
        human.firstName = "Yaroslav";
        human.lastName = "Shabatura";
        human.height = 178.8;
        System.out.println(human.firstName);
        System.out.println(human.lastName);
        System.out.println(human.weight);
        System.out.println(human.age);
        System.out.println(human.height);
    }
}
