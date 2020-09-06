package Exercise2;

public class Main {

    public static void main(String[] args) {

        int toAdd = 0;
        for (int i = 1; i <= 100; i++) {
            i += toAdd;
            System.out.println(i);
            toAdd += 2;

        }

    }
}
