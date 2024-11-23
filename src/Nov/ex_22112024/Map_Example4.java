package Nov.ex_22112024;

import java.util.HashMap;
import java.util.Map;

public class Map_Example4 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", null);
        map.put(null, 100);
        System.out.println(map);

        for(Map.Entry<String, Integer> items : map.entrySet())
        {
            System.out.println(items.getKey() + " -> " + items.getValue());
        }

    }
}
