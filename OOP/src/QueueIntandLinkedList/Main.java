package QueueIntandLinkedList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("Java");
        q.add("Python");
        q.add("C++");

        while (!q.isEmpty()) {
        System.out.println(q.poll());
        }
    }
}
