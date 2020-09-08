package Exercise10;

public class Main {

    public static void main(String[] args) {

        String marker = "";
        String numbers = "";

        for (int k = 0; k < 6; k++) {
            for (int i = 1; i <= 9 ;i++) {
                marker += " ";
                numbers += i;
                if (i == 9) {
                    marker += "|";
                    numbers += "0";
                }
            }
        }

        System.out.println(marker);
        System.out.println(numbers);


    }
}
