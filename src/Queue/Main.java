package Queue;

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
        QueueWithPriority queue = new QueueWithPriority();

        System.out.println("****************************QUEUE WITH PRIORITY****************************");
        System.out.println("Queue is empty : " + queue.isEmpty());
        System.out.println("The size of queue is : " + queue.size());
        System.out.println("***********************************END*************************************");
    }
}
