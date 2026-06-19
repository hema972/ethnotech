package ethno.collectionnn.Sett;
import java.util.*;
public class Linkhasset {
    public static void main(String[] args){
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        System.out.println(lhs);
        System.out.println(lhs.contains(20));
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.remove(30));
        System.out.println(lhs);
        System.out.println(lhs.iterator().next());
    }
    
}
