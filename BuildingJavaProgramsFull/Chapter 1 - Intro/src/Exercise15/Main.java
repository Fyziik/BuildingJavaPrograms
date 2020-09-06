package Exercise15;

public class Main {

    public static void main(String[] args) {

        System.out.println(printTop());
        System.out.println(printBottom());
        System.out.println(printBottom());
        System.out.println(line());
        System.out.println(printTop());
        System.out.println(printStop());
        System.out.println(printBottom());
        System.out.println(printTop());
        System.out.println(line());




    }

    public static String printTop() {
        return "   _____" + '\n' + " /       \\" + '\n' + "/         \\";
    }

    public static String printBottom() {
        return "\\         /" + '\n' + " \\_______/";
    }

    public static String line() {
        return " +-------+" + '\n';
    }

    public static String printStop() {
        return "|   STOP  |";
    }
}
