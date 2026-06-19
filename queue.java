package ethno.collectionnn.queue;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        String [] names={"Hema","latha","nandini","gnana","priya"};
        Queue<String> q=new LinkedList<>();

        for(String s:names){
            q.add(s);
        }
        q.add("sri");
        q.add("sai");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println(q);
       // String nam=sc.nextLine();
            if(!(q.contains(names))){
                System.out.println(q.remove());
            }
            else
            {
                System.out.println("Student is not registered");
            }
        System.out.println(q);
    }
    }





    


