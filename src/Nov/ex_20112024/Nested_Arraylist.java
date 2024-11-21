package Nov.ex_20112024;

import java.util.ArrayList;
import java.util.List;

public class Nested_Arraylist {
    public static void main(String[] args) {

        List fruits = new ArrayList();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("cherry");
        System.out.println(fruits);

        List fruits1 = new ArrayList();
        fruits1.add("mango");
        fruits1.add("potato");
        fruits1.add("watermelon");
        System.out.println(fruits1);

        List all_fruits = new ArrayList();
        all_fruits.add(fruits);
        all_fruits.add(fruits1);
        System.out.println(all_fruits);
        all_fruits.add("Onion");
        all_fruits.add("7");
        System.out.println(all_fruits);
    }
}
