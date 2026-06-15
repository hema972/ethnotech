package ethno.Threadds;
import java.util.*;

class Mythread extends Thread{
    //@Override
    public void run(){
        Sysout.println("Thread is started running");
    }
} 
public class threadd {
    public static void main(String[] args){ //it is also a thread performing the main method execution
        //creation of thread
        Thread t1=new Thread(new Mythread());
        t1.start();
    }
}
