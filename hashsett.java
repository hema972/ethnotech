package ethno.collectionnn.Sett;
import java.util.*;

public class hashsett {
    public static void main(String[] args){

        //Declaration of a hashset using the class reference
        //Wont allow duplicates and does not maintain insertion order
        System.out.println("===========Set==============");
        Set<Integer> roll=new HashSet<>(); //we cant create obj for set because its an interface but we can create obj for hashset and assign it to set reference
        roll.add(1);
        roll.add(2);
        roll.add(3);
        roll.add(3);
        System.out.println("This is a set:"+roll);
        System.out.println("The size of the set is:"+roll.size());
        System.out.println("The set is empty:"+roll.isEmpty());
        System.out.println("The set contains 2:"+roll.contains(2));
        //roll.remove(2);
        System.out.println("The set after removing 2:"+roll);

        //Declaration of a hashset using the interface reference
        //dont allow duplicates and does not maintain insertion order
        System.out.println("===========HashSet==============");
        HashSet<Integer> hs=new HashSet<>(); //can create object
        hs.add(4);
        hs.add(5);
        hs.add(11);
        hs.add(23);  //output not sorted from it randomly gives op 
        System.out.println("This is a hashset:"+hs);
        System.out.println("The size of the hashset is:"+hs.size());
        System.out.println("The hashset is empty:"+hs.isEmpty());
        System.out.println("The hashset contains 3:"+hs.contains(3));
        //hs.remove(5);
       // System.out.println("The hashset after removing 5:"+hs);



    }
    
}
