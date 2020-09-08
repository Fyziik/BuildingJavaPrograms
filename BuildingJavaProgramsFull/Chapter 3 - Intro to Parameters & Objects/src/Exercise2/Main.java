package Exercise2;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.printPowersOf2(3);
        main.printPowersOf2(10);


    }

    public void printPowersOf2(int max) {

        for (int i = 0; i <= max; i++) {
            System.out.print((int)Math.pow(2, i) + " ");
        }
        System.out.println();
    }
}
