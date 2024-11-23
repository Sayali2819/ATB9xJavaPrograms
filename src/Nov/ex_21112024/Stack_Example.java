package Nov.ex_21112024;

import java.util.Stack;

public class Stack_Example {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("Pramod");
        s.add("dutta");
        s.add("Pramod");
        s.add("Amit");
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
        System.out.println(s.isEmpty());
        s.add("Moksha");
        s.push("Kirti");
        s.add(2, "Vijay");
        System.out.println(s);
        System.out.println(s.get(4));
        System.out.println(s.get(0));
    }
}
