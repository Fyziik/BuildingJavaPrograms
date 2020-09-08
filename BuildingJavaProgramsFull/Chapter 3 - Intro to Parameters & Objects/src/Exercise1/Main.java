package Exercise1;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.printNumbers(15);
        main.printNumbers(5);
    }

    public void printNumbers(int max) {

        for (int i = 0; i <= max; i++) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
    }
}
