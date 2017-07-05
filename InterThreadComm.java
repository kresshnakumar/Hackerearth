import java.util.Scanner;
public class InterThreadComm{
    public static void main(String[] args)  throws InterruptedException {
        final PC pc = new PC();
        // creating a thread object that calls produce()
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // create another thread object that calls consume()
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                try {
                    pc.consume();
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // start both threads
        t1.start();
        t2.start();

        //t1 finishes before t2
        t1.join();
        t2.join();
    }
    public static class PC {
        public void produce() throws InterruptedException {
            synchronized(this) {
                System.out.println("producer is running");
                //  releases the lock on shared resource
                wait();
                // and waits till some other method calls notify()
                System.out.println("resumed");
            }
        }
        // Sleeps for sometime and waits for a key to press. After key is pressed
        // it notifies produce
        public void consume() throws InterruptedException {
            // this makes the produce thread to run first
            Thread.sleep(1000);
            Scanner sc = new Scanner(System.in);
            // synchronizes block ensures only one thread running at a time
            synchronized(this) {
                System.out.println("Waiting for return key");
                sc.nextLine();
                System.out.println("return key pressed");
                // notifies the produce thread that wakes up
                notify();
                Thread.sleep(2000);
            }
        }
    }
}
