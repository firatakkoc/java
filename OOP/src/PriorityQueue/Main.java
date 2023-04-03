package PriorityQueue;
import java.time.Period;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(10);

        System.out.println(queue.peek());
        System.out.println(queue.contains(100));

        System.out.println("--------------------------");

        // foreach kullanmiyoruz cünkü düzensiz cikti veriyor;
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
