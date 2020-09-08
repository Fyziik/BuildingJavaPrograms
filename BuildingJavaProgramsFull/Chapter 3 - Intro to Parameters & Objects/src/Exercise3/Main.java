package Exercise3;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.printPowersOfN(4, 3);
        main.printPowersOfN(5, 6);
        main.printPowersOfN(-2, 8);

    }

    public void printPowersOfN(int base, int exponent) {

        for (int i = 0; i <= exponent; i++) {
            System.out.print((int)Math.pow(base, i) + " ");
        }
        System.out.println();
    }
}
