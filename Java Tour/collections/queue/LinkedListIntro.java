package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListIntro {
    public static void main(String[] args){
        Queue<Integer> q= new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);

        System.out.println(q.poll()); // it will remove the element
        System.out.println(q);

        System.out.println(q.peek()); // which element is next one

        System.out.println(q.add(5));
    }
}
