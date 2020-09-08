package Exercise1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        ArrayList<Integer> test = main.addToArrayList(1, 2, 3);
        main.printArraylist(test);
        ArrayList<Integer> secondList = main.cloneArrayList(test);
        main.removeFirst(test);
        main.printArraylist(test);
        main.printArraylist(secondList);


    }

    public ArrayList<Integer> addToArrayList(int first, int second, int third) {
        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.add(first);
        tmp.add(second);
        tmp.add(third);
        return tmp;
    }

    public void printArraylist(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }

    public ArrayList<Integer> cloneArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.addAll(list);
        return tmp;
    }

    public void removeFirst(ArrayList<Integer> list) {
        list.remove(0);
    }

}
