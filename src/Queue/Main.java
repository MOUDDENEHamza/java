package Queue;

import java.util.Iterator;

/**
 * @author MOUDDENE HAMZA
 */
public class Main {

    /**
     *
     * Main function.
     *
     */
    public static void main(String[] args) {
        int i;
        QueueWithPriority<Integer> queue = new QueueWithPriority<>();
        Iterator<Integer> it = queue.iterator();

        System.out.println("****************************QUEUE WITH PRIORITY****************************");
        System.out.println("Queue is empty : " + queue.isEmpty());
        System.out.println("The size of queue is : " + queue.size());
        System.out.println("Queue is : " + queue.toString());
        System.out.println("Added element is : 3");
        queue.add(3);
        System.out.println("Added element is : 1");
        queue.add(1);
        System.out.println("Added element is : 2");
        queue.add(2);
        System.out.println("Added element is : 5");
        queue.add(5);
        System.out.println("Queue is : " + queue.toString());
        while (it.hasNext()) {
            it.next();
        }
        System.out.println("***********************************END*************************************");
    }
}
