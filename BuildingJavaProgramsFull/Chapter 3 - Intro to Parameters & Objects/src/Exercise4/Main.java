package Exercise4;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.printSqure(3, 7);


    }

    public boolean printSqure(int min, int max) {
        //TODO fix method, probably confusing myself even more
        if (max < min) {
            return false;
        }

        int stepTracker = 0;
        int steps = max - min + 1;
        int loops = 0;
        for (int i = min; i <= max; i++) {
            System.out.print(i);



            if (i == max) {
                i = min;
            }

            stepTracker++;
            if (stepTracker == steps) {
                System.out.println();
                stepTracker = 0;
            }
            loops++;
            if (loops == ((max - min) * 5)) {
                break;
            }
        }

        return true;
    }
}
