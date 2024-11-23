package Nov.ex_21112024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Example {
    public static void main(String[] args) {

        Set hs = new HashSet();
//        Set lhs = new LinkedHashSet();
//        Set ts = new TreeSet();

        hs.add("Apple");
        hs.add("Mango");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        hs.add("Orange");
        System.out.println(hs);

        Set lhs = new LinkedHashSet();
        lhs.add("Kiwi");
        lhs.add("Pineapple");
        lhs.add("Pineapple");
        lhs.add("WaterMelon");
        lhs.add("Orange");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());

        Set ts = new TreeSet();
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Mapple");
        ts.add("Orange");
        System.out.println(ts);

    }
}
