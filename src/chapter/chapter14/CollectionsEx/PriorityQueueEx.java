package chapter.chapter14.CollectionsEx;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(15);
        pQueue.add(30);
        pQueue.add(20);
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());

    }

}
