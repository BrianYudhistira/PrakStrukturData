import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public void queueExample(){
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DopNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("Remove: " + queue.remove());
        System.out.println("ELement: " + queue.element());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Peek: " + queue.peek());
    }

    public static void main(String[] args) {
        new MainQueue().queueExample();
    }
}