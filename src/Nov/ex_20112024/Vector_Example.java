package Nov.ex_20112024;

import java.util.Vector;

public class Vector_Example {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Pramod");
        v.add("Siya");
        v.add("Dutta");
        v.add("Siya");
        v.add("Moksh");
        System.out.println(v);
        v.remove("Dutta");
        System.out.println(v);
        System.out.println(v.contains("Dutta"));
    }
}
