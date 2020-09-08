package Exercise3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        ArrayList<String> test = new ArrayList<>();
        test.add("one");
        test.add("two");
        test.add("three");
        test.add("four");
        test.add("five");
        test.add("six");
        test.add("four");
        System.out.println(test);
        main.removeEvenLength(test);
        System.out.println(test);


    }

    public void removeEvenLength(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

    }
}
