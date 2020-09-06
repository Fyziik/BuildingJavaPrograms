package Exercise7;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
