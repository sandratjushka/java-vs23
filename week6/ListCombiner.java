package week6;

import java.util.ArrayList;

public class ListCombiner {

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(6);
        list2.add(7);

        combine(list1, list2);

        System.out.println(list1);
        System.out.println(list2); 
    }
}

