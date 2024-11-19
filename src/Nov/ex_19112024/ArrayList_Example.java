package Nov.ex_19112024;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList studentList = new ArrayList();
        List list1 = new ArrayList();

        studentList.add("Mayur");
        studentList.add("Pramod");
        studentList.add("Anil");
        studentList.add(1234);
        studentList.add("Sakshi");
        studentList.add("Pramod");
        studentList.add(true);
        studentList.add(null);
        studentList.add("Durva");

        System.out.println(studentList);
        System.out.println("Size of Arraylist:" + studentList.size());

        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("1");
        list1.add("2");

        System.out.println(list1);
        System.out.println(list1.isEmpty());
        System.out.println(list1.contains("2"));
        System.out.println(list1.indexOf("3"));
        System.out.println(list1.lastIndexOf("2"));
    }
}
