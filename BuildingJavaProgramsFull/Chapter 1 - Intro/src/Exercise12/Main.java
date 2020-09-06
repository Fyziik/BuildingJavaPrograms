package Exercise12;

public class Main {

    public static void main(String[] args) {

        System.out.println(repeat() +'\n');
        System.out.println(repeat());
        System.out.println(repeatWest());
        System.out.println(repeat() + '\n');
        System.out.println(repeat());
        System.out.println(repeatWest());
        System.out.println(repeat() + '\n');
        System.out.println(repeat());


    }

    public static String repeat() {
        return "Go, team, go!" + '\n' + "You can do it.";
    }

    public static String repeatWest() {
        return "You're the best," + '\n' + "In the West.";
    }
}
