package Exercise11;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        final int loops = 7;
        final int max = 7;

        main.numbers(loops, max);

    }

    public void numbers(int loops, int max) {

        String marker = "";
        String numbers = "";

        for (int k = 0; k < loops; k++) {
            for (int i = 1; i <= max ;i++) {
                marker += " ";
                numbers += i;
                if (i == max) {
                    marker += "|";
                    numbers += "0";
                }
            }
        }

        System.out.println(marker);
        System.out.println(numbers);

    }
}
