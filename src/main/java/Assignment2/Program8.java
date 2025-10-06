package Assignment2;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class Program8 {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(6);

        //producer thread
        Thread producer = new Thread(() -> {
            int i = 1;
            while (i<=10) {
                try {
                    System.out.println("Producer produced: " + i);
                    queue.put(i); // add item into the queue (waits if full)
                    i++;
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //Consumer thread
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    int value = queue.take(); // removing but printing(wait is empty)
                    System.out.println("Consumer consumed: " + value);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        producer.start();
        consumer.start();
    }


}
