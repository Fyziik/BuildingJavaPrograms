package Exercise4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        ArrayList<String> test1 = new ArrayList<>();
        ArrayList<String> test2 = new ArrayList<>();

        test1.add("one");
        test1.add("two");

        test2.add("Banana");
        test2.add("Orange");
        test2.add("Apple");

        ArrayList<String> combined = main.createCombinedList(test1, test2);
        System.out.println(combined);

    }

    public ArrayList<String> createCombinedList(ArrayList<String> first, ArrayList<String> second) {
        ArrayList<String> tmp = new ArrayList<>();

        for (int i = 0; i < first.size(); i++) {
            tmp.add(first.get(i));
            for (int k = 0; k < second.size(); k++) {
                tmp.add(second.get(k));
            }

        }



        return tmp;
    }
}
