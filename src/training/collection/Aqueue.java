package training.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aqueue {

    public static void main(String[] args) {
        Queue<Integer> queue= new PriorityQueue<>();

        queue.add(5);
        System.out.println(queue);
        queue.add(7);
        System.out.println(queue);
        queue.add(1);
        System.out.println(queue);
        queue.add(0);
        System.out.println(queue);
        queue.add(60);
        System.out.println(queue);
    }
}
