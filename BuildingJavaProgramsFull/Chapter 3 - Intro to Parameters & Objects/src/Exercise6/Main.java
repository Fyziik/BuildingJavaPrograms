package Exercise6;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        System.out.println(main.largerAbsVal(11, 2));
        System.out.println(main.largerAbsVal(4, -5));

    }

    public int largerAbsVal(int first, int second) {

        if (Math.abs(first) > Math.abs(second)) {
            return Math.abs(first);
        }
        else return Math.abs(second);
    }
}
