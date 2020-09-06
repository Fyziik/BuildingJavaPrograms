package Exercise8;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
