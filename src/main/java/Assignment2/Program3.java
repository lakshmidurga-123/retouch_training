package Assignment2;

public class Program3 {

        private static Program3 Singleton;

        private Program3() {
            System.out.println("Singleton instance created!");
        }

        public static Program3 getInstance() {
            if (Singleton==null) {//it can checks null or not ,here still null
                synchronized (Program3.class) {//here we lock the class
                    if (Singleton == null) {   //here till now it is still y because we are not created object
                        Singleton = new Program3();// we create a object
                    }
                }
            }
            return Singleton;
        }
    }

    // Test class
    class Main {
        public static void main(String[] args) {
            // Create threads to test thread-safety
            Thread t1 = new Thread(() -> System.out.println(Program3.getInstance()));
            Thread t2 = new Thread(() -> System.out.println(Program3.getInstance()));

            t1.start();
            t2.start();
        }
    }

