import java.lang.*;
class MultiThread implements Runnable {
    public void run() {
        try {
            System.out.println("first before");
            Thread.sleep(500);
            System.out.println("first after");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1500);
            System.out.println("second");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread1 while it called join() method on thread2 -"+
            ThreadState.thread1.getState());
        try {
            Thread.sleep(200);
            System.out.println("third");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ThreadState implements Runnable {
    public static Thread thread1;
    public static ThreadState object;
    public static void main(String[] args) {
        object = new ThreadState();
        thread1 = new Thread(object);

        // State of thread  before start() is called
        System.out.println("before start() called thread1 is in: "+thread1.getState());
        thread1.start();
        System.out.println("after start() calledthread1 is in : "+thread1.getState());
    }
    public void run() {
        MultiThread myThread = new MultiThread();
        Thread thread2 = new Thread(myThread);
        System.out.println("before start() called thread2 is in : "+thread2.getState());
        thread2.start();
        System.out.println("after start() called thread2 is in : "+thread2.getState());
        try {
            Thread.sleep(500);
            System.out.println("Main first");
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread2 after calling .sleep() method on it - "+
            thread2.getState());
        try
        {
            // waiting for thread2 to die
            thread2.join();
            System.out.println("main second");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("State of thread2 when it has finished it's execution - " +
            thread2.getState());
    }
}