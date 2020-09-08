package Exercise7;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        System.out.println(main.largerAbsVal(7, -2, -11));
        System.out.println(main.largerAbsVal(-4, 5, 2));

    }

    public int largerAbsVal(int first, int second, int third) {

        if (Math.abs(first) > Math.abs(second)) {
            if (Math.abs(first) > Math.abs(third)) {
                return Math.abs(first);
            }
            else {
                return Math.abs(third);
            }
        }

        if (Math.abs(second) > Math.abs(first)) {
            if (Math.abs(second) > Math.abs(third)) {
                return Math.abs(second);
            }
            else return Math.abs(third);
        }

        return -1;
    }
}
