package Exercise1;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        System.out.println(main.fractionSum(5));

    }

    public double fractionSum(int number) {

        double tmp = 0;

        for (double i = 1; i <= number; i++) {
            tmp += 1 / i;
        }

        return tmp;
    }
}
