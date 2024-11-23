package Nov.ex_21112024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Example {
    public static void main(String[] args) {

        List mylist = new LinkedList();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(3);
        mylist.add(4);

        System.out.println(mylist);

        ArrayList list = new ArrayList();
        list.add("Node 1");
        list.add("Node 2");
        list.add("Node 3");
        System.out.println(list);

    }
}
