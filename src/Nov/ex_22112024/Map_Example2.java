package Nov.ex_22112024;

import java.util.HashMap;
import java.util.Map;

public class Map_Example2 {
    public static void main(String[] args) {
        //Map<String, Integer> map = new HashMap<String,Integer>();
        //Map<String, Integer> map = new HashMap<>();
        Map<String,Integer> map = new HashMap();
        map.put("id", 1);
        map.put("id1", 2);
        map.put("id1", 2);
        map.put("id2", 34);
        map.put("id4", null);
        map.put("id5", null);
        map.put("id3", 101);
        map.put(null, 90);
        map.put(null, 67);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue(2));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id2"));



    }
}
