package ethno.collectionnn.Sett;
import java.util.*;
public class treesett {
    public static void main(String[] args){
        System.out.println("===========List==============");
        List<Integer> li=new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        System.out.println(li);
        System.out.println("===========TreeSet==============");
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for(Integer h:li){ //travering the list and adding to treeset
            ts.add(h);
        }
        System.out.println(ts);
        System.out.println(ts.contains(20));
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());
        System.out.println(ts.remove(30));
        System.out.println(ts);
        
    }
    
}
