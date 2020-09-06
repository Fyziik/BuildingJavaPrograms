package Exercise14;

public class Main {

    public static void main(String[] args) {

        System.out.println(topPart() + '\n');
        System.out.println(topPart());
        System.out.println(windows());
        System.out.println(longLine());
        System.out.println(topPart() + '\n');
        System.out.println(topPart());
        System.out.println(shortLine());
        System.out.println(windows());
        System.out.println(windows());
        System.out.println(shortLine());
        System.out.println(shortLine());


    }

    public static String topPart() {
        return "    *****" + '\n' + "  *********" + '\n' + "*************";
    }

    public static String windows() {
        return "* | | | | | *";
    }

    public static String longLine() {
        return "*************";
    }

    public static String shortLine() {
        return "    *****";
    }
}
