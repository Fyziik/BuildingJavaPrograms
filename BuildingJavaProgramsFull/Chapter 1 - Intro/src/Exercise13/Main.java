package Exercise13;

public class Main {

    public static void main(String[] args) {

        System.out.println(doubleLines());
        System.out.println(xShape() + '\n');
        System.out.println(doubleLines());
        System.out.println(xShape());
        System.out.println(doubleLines() + '\n');
        System.out.println(lineDown());
        System.out.println(doubleLines());
        System.out.println(xShape());

    }

    public static String doubleLines() {
        return "*****" + '\n' + "*****";
    }

    public static String xShape() {
        return " * *" + '\n' + "  *" + '\n' + " * *";
    }

    public static String lineDown() {
        return "  *" + '\n' + "  *" + '\n' + "  *";
    }
}
