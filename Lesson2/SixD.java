public class SixD {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            for (int j = 0; j<4-i; j++){
                System.out.print(" ");
            }
            for (int q = 0; q <(2*i+1); q++) {
                System.out.print("*");

            }
            System.out.println();
            }
    }
}
