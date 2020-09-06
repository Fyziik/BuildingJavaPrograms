package Exercise11;

public class Main {

    public static void main(String[] args) {

        System.out.println(triangle());
        System.out.println(square());
        System.out.println(text());
        System.out.println(square());
        System.out.println(triangle());

    }

    public static String triangle() {
        return   "   /\\       /\\" + '\n' + "  /  \\     /  \\" + '\n' + " /    \\   /    \\";
    }

    public static String square() {
        return "+------+ +------+" + '\n' + "|      | |      |" + '\n' + "|      | |      |" + '\n' + "+------+ +------+";
    }

    public static String text() {
        return "|United| |United|" + '\n' + "|States| |States|";
    }
}
