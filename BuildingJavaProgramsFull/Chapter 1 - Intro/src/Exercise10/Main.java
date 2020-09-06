package Exercise10;

public class Main {

    public static void main(String[] args) {

        System.out.println(printEggWithoutLine());
        System.out.println(printLine());
        System.out.println(printEggWithoutLine());
        System.out.print(printLine());
        System.out.println(printBottom());
        System.out.println(printEgg());

    }

    public static String printEgg() {
        return  printTop() + printLine() + printBottom();
    }

    public static String printEggWithoutLine() {
        return printTop() + printBottom();
    }


    public static String printLine() {
        return "_\"_'_\"_'_\"_" + '\n';
    }

    public static String printBottom() {
        return "\\         /" + '\n' + " \\_______/" + '\n';
    }

    public static String printTop() {
        return "   _____" + '\n' + " /       \\" + '\n' + "/         \\" + '\n';
    }
}
