package code;

import java.util.ArrayList;
import java.util.List;

class ArrayListTester {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("My list is :" + list);

        System.out.println("==========");
        list.set(2,15);
        System.out.println(list);

        System.out.println("===");
        list.add(2,20);
        System.out.println(list);

        System.out.println("=========");

        System.out.println(list.get(3));

        System.out.println("==========");
        list.remove(4);
        System.out.println(list);


    }
}

