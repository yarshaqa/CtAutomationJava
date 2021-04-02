package task7;

public class MainClass {

    public static void main(String[] args) {
        TaskSevenInitializationBlock myId = new TaskSevenInitializationBlock(13, "Stringa");
        TaskSevenInitializationBlock myId2 = new TaskSevenInitializationBlock(14, "Str");

        System.out.println(myId.count);
        System.out.println(myId.getId());
        System.out.println(myId2.getId());
    }
}
