package Nov.ex_20112024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_Example {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        List mylist2 = new LinkedList();

        List fruits = List.of("Orange", "Apple", "Mango");
//        fruits.add("WaterMelon"); -> Invalid as add is not supported as .of do not allow
        //to add, delete
        System.out.println(fruits);


    }
}
