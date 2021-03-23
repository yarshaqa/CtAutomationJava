public class Five2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 1;
        int array[] = new int[a];
        for (int i = 0; i <=a-1; i++){
            array[i] = i+1;
            b = b*array[i];

//            System.out.println(b);
        }

        System.out.println(b);
    }
}
