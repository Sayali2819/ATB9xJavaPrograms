package Nov.ex_22112024;

import java.util.HashMap;
import java.util.Map;

public class Map_Example1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();

        //Fixed Data Type
//        Map<String,Object> m1 = new HashMap();
        m1.put("name", "Pramod");
        m1.put("phone", 78452512);
        m1.put("rollNo", 347);
        System.out.println(m1);

    }
}
