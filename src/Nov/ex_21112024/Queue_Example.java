package Nov.ex_21112024;

import java.util.PriorityQueue;

public class Queue_Example {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("1");
        pq.offer("3");
        pq.offer("2");
        pq.offer("5");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
