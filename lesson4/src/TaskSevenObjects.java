public class TaskSevenObjects {
    TaskSevenInitializationBlock myId = new TaskSevenInitializationBlock(13, "Stringa");
    TaskSevenInitializationBlock myId2 = new TaskSevenInitializationBlock(14, "Str");


    public static void main(String[] args) {
        System.out.println(myId.nextId);
        System.out.println(TaskSevenInitializationBlock.count);
    }
}
