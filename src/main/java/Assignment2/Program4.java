package Assignment2;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Program4 {
        public static void main(String[] args) throws InterruptedException {

            // HashMap (not thread-safe)
            Map<Integer, String> hashMap = new HashMap<>();

            // ConcurrentHashMap (thread-safe)
            Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();

            // Thread to write to both maps
            Thread writer = new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    hashMap.put(i, "HashMapValue" + i);
                    concurrentMap.put(i, "ConcurrentValue" + i);
                    System.out.println("Writer added: " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            // Thread to read both maps at the same time
            Thread reader = new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Reader sees (HashMap): " + hashMap);
                    System.out.println("Reader sees (ConcurrentHashMap): " + concurrentMap);
                    try {
                        Thread.sleep(150); // Simulate delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            writer.start();
            reader.start();

            writer.join();
            reader.join();

            System.out.println("\nFinal HashMap: " + hashMap);
            System.out.println("Final ConcurrentHashMap: " + concurrentMap);
        }
    }

