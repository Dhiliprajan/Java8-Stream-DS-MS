package datastructure.queue;
import java.util.*;
public class MyQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("O");
        queue.offer("A");
        queue.offer("I");
        queue.offer("U");
        queue.offer("E");

        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
}
