package Exercise8;

public class Main {

    public static void main(String[] args) {

        String toPrint = rightAngle();
        toPrint += words();
        toPrint += leftAngle();
        toPrint += words();
        toPrint += leftAngle();
        toPrint += words();
        toPrint += leftAngle();
        toPrint += words();
        toPrint += leftAngle();
        toPrint += words();
        toPrint += leftAngle();
        System.out.println(toPrint);


    }

    public static String rightAngle() {
        return "//////////////////////" + '\n';
    }

    public static String leftAngle() {
        return "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + '\n';
    }

    public static String words() {
        return "|| Victory is mine! ||" + '\n';
    }
}
