package collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PeriorityQueueIntro {
    public static void main(String[] args){
        Queue<Integer> pq= new PriorityQueue<>(); // by default it follows the min heal (under the hood it implements)
        pq.offer(17);
        pq.offer(26);
        pq.offer(3);

        System.out.println(pq);


        Queue<Integer> integers= new PriorityQueue<>(Comparator.reverseOrder());
        integers.offer(17);
        integers.offer(26);
        integers.offer(3);

        System.out.println(integers);
    }
}
