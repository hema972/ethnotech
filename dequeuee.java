package ethno.collectionnn.queue;
import java.util.*;
public class dequeuee {
    public static void main(String[] args) {
        Deque<String> dq=new LinkedList<>();
        dq.add("Hema");
        dq.add("latha");
        dq.add("goodgirl");
        dq.offer("gnana");
        System.out.println(dq.peek());
        dq.remove();
        
        
        
    }
    
}
