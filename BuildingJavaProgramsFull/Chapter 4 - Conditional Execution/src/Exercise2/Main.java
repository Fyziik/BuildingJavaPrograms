package Exercise2;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        System.out.println(main.repl("hello", 3));

    }

    public String repl(String txt, int repetitions) {
        if (repetitions <= 0) {
            return "";
        }
        String tmp = "";
        for (int i = 0; i < repetitions; i++) {
            tmp += txt;
        }
        return tmp;
    }
}
