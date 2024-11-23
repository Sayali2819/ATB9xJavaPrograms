package Nov.ex_21112024;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Example {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Date");
        vector.add("Cherry");
        vector.add("Banana");

        for (Object fruits : vector)
        {
            System.out.println(fruits);
        }

        System.out.println("--------------------------------------");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
    }
}
