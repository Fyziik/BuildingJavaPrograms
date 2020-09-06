package Exercise1;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        final int s = 5;
        final int v = 10;
        final int a = 10;
        final int t = 50;

        double result = main.calculate(s, v, a, t);

        System.out.println(result);

    }

    public double calculate(int s, int v, int a, int t) {
        return s + (v * t) + (0.5 * a * Math.pow(t, 2));
    }
}
