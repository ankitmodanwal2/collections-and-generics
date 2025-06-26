package in.javacoding.collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestionQueue {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.offer(2);
Utility.printList(queue);
    }
}
