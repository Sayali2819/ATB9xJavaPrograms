package Nov.ex_22112024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_Example3 {
    public static void main(String[] args) {
        Map<String,Object> stud1 = new HashMap();
        stud1.put("name", "Shobha");
        stud1.put("phone no", "9056346671");
        stud1.put("address", "Bangalore");
        System.out.println(stud1);


        Set books = new HashSet();
        books.add("Rich dad poor dad");
        books.add("Sapiens");
        books.add("Atomic Habits");
        books.add("Secret");
        books.add("Atomic Habits");
        books.add("Eat the frog");
        System.out.println(books);
    }
}
