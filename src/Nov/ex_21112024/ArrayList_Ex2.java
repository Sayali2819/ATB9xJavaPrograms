package Nov.ex_21112024;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Ex2 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Shriya");
        mylist.add("Dutta");
        mylist.add("Meetali");

        System.out.println("To Print Arraylist - 1:");
        for(String names : mylist)
        {
            System.out.println(names);
        }

        System.out.println(" ");
        System.out.println("To Print Arraylist - 2:");
        for(int i = 0; i<mylist.size(); i++)
        {
            System.out.println(mylist.get(i));
        }

        System.out.println(" ");
        System.out.println("To Print Arraylist - 3:");
        Iterator<String> it = mylist.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
