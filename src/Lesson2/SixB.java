public class SixB {
    public static void main(String[] args) {
        String a = "*";
        String b = " ";

        for (int i = 0; i < 8; i++){
            System.out.print(a);
            }
        System.out.println();
        for (int i=1; i<4; i++){
            System.out.print(a);
            for(int j =0; j<6; j++){
                System.out.print(b);
            }
            System.out.println(a);
        }
        for (int i = 0; i < 8; i++){
            System.out.print(a);
        }
    }
}