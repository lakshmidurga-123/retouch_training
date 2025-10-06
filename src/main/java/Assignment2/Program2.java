package Assignment2;

public class Program2 {
        int x = 1;
        final int y = 20;
    }

    class OddEven {
        public static void main(String[] args) {
            Assignment2.Program2 obj = new Assignment2.Program2();

            // Thread for odd numbers
            Thread oddThread = new Thread(() -> {
                while (obj.x <= obj.y) {
                    synchronized (obj) {
                        if (obj.x % 2 == 1) {
                            System.out.println("Odd  : " + obj.x);
                            obj.x++;
                            obj.notify();
                        } else {
                            try {
                                obj.wait();

                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });

            // Thread for even numbers
            Thread evenThread = new Thread(() -> {
                while (obj.x <= obj.y) {
                    synchronized (obj) {
                        if (obj.x % 2 == 0) {
                            System.out.println("Even : " + obj.x);
                            obj.x++;
                            obj.notify();
                        } else {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });

            // Start both threads
            oddThread.start();
            evenThread.start();
        }
    }

