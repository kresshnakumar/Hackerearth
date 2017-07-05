class ChildThread extends Thread {
    public void run() {
        for (int i = 0; i < 5 ; i++ ) {
            System.out.println("Child Thread");
        }
    }
}
public class MainThread extends Thread {
    public static void main(String[] args) {
        // Getting main thread
        Thread t = Thread.currentThread();
        // name of main thread
        System.out.println(t.getName());
        // changing the main thread name
        t.setName("Root");
        System.out.println("after changing name is :"+t.getName());
        // to know priority of thread
        System.out.println(t.getPriority());
        // changing the priority of the thread
        t.setPriority(MAX_PRIORITY);
        System.out.println("after setting max priority :"+t.getPriority());

        ChildThread ct = new ChildThread();
        //Thread t2 = new Thread(ct);
        // getting the priority of the child thread
        System.out.println(ct.getPriority());
        //changing the priority of the child  thread
        ct.setPriority(MIN_PRIORITY);
        System.out.println("after seting min priority"+ct.getPriority());
        ct.start();
    }
}