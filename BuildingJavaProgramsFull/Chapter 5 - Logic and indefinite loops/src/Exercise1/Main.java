package Exercise1;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        main.showTwos(7);
        main.showTwos(18);
        main.showTwos(68);
        main.showTwos(120);

    }

    public void showTwos(int number) {

        int tmp = number;
        int succesfulLoops = 0;

        while ((tmp % 2) == 0) {
            succesfulLoops++;
            tmp /= 2;
        }

        String toAdd = "";

        for (int k = 0; k < succesfulLoops; k++) {
            toAdd += "2 * ";
        }
        toAdd += "" + number;

        System.out.println(number + " = " + toAdd);

    }
}
