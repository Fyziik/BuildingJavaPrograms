package Exercise9;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------------------------------------");
        for (int k = 0; k < 10; k++) {
            System.out.print("_-^-");
        }
        System.out.println();
        for (int l = 0; l < 2; l++) {
            for (int j = 1; j <= 10; j++) {
                for (int m = 0; m < 2; m++) {
                    if (j == 10) {
                        System.out.print(0);
                    }
                    else {
                        System.out.print(j);
                    }
                }
            }
        }
        System.out.println();
        System.out.println("----------------------------------------");

    }
}
