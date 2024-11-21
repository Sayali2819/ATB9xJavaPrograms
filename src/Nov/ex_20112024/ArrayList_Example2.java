package Nov.ex_20112024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Example2 {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("bread");
        list.add("milk");
        list.add("67");
        list.add("butter");
        list.add("paneer");
        list.add("8");
        list.add("cheeze");
        list.add(null);
        list.add("jam");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("butter"));

        System.out.println(" ");
        System.out.println("Iterate using for loop:");
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println(" ");
        System.out.println("Iterate using for each loop:");
        for(Object o : list)
        {
            System.out.println(o);
        }

        System.out.println(" ");
        System.out.println("Iterate using iterator:");
        Iterator iterate = list.iterator();
        while(iterate.hasNext())
        {
            System.out.println(iterate.next());
        }

    }
}
