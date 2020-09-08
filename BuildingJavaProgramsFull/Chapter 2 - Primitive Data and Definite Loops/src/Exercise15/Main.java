package Exercise15;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.printDesign();

    }

    public void printDesign() {

        for (int i = 0; i < 5; i++) {

            for (int k = 0; k < (5-i); k++) {
                System.out.print("-");
            }

            System.out.println();

        }


    }
}
