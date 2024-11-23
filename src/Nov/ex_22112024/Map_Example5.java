package Nov.ex_22112024;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Map_Example5 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
//        ht1.put(3, null); -> not allowed
//        ht1.put(null, "four");  -> not allowed
        System.out.println("ht1:" + ht1);

        HashMap<Integer, String> ht2 = new HashMap<>();
        ht2.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
//        ht1.put(3, null);
//        ht1.put(null, null);
        System.out.println("ht2:" + ht2);

        Enumeration<Integer> e = ht1.keys();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());

        }


    }
}
