import java.util.*;
class Multithread implements Runnable{
    public void run() {
        try{
            //Displaying the thread that is running
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }catch(Exception e){
            System.out.println("Exception is "+e);
        }
    }
}
public class CreateThread{
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++ ) {
            //Multithread object = new Multithread();
            Thread object = new Thread(new Multithread());
            object.run();
        }
    }
}