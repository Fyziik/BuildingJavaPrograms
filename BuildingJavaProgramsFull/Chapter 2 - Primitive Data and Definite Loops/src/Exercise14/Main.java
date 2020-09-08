package Exercise14;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int k = 9; k >= 0; k--) {
                for (int m = 0; m < k; m++) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
