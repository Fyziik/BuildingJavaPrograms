package Exercise2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        ArrayList<String> test = new ArrayList<>();
        test.add("to");
        test.add("be");
        test.add("or");
        test.add("not");
        test.add("to");
        test.add("be");
        test.add("hamlet");
        System.out.println(test);
        main.switchArrayList(test);
        System.out.println(test);

    }

    public void switchArrayList(ArrayList<String> list) {

        ArrayList<String> firsts = new ArrayList<>();
        ArrayList<String> seconds = new ArrayList<>();


        // Sort list into two arraylists of 1st word and 2nd word being switched
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                seconds.add(list.get(i));
            }
            else {
                firsts.add(list.get(i));
            }
        }
        //System.out.println("Firsts: " + firsts);
        //System.out.println("Seconds: " + seconds);
        //Empty arraylist & insert into 'new' arraylist
        list.clear();

        for (int k = 0; k < firsts.size(); k++) {
            list.add(firsts.get(k));
            list.add(seconds.get(k));
        }

        if (seconds.size() > firsts.size()) {
            list.add(seconds.get(seconds.size()-1));
        }


    }

}
