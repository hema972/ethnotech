package ethno.collectionnn.Listt;
/*import java.util.LinkedList;
public class Linkedlis {
   public static void main(String[] var0) {
      LinkedList<String> var1 = new LinkedList<>();
      var1.add("Hema");
      var1.add("latha");
      var1.add("goodgirl");
      System.out.println(var1);
      System.out.println(var1.get(0));
   }
}*/
class node
{
    String name;
    node next;
    //Datatype is node itself.
    //This is called a self-referential variable because it refers to another object of the same class.
    node(){
        //this.name=name;
        next=null;

    }

}
class BusStop
{
node head;
public void addStop(String name) {
    node newnode = new node();
    newnode.name = name;
    if (head == null) {
        head = newnode;
        return;
    }
    //head.next=newnode;
    node temp = head;
    while(temp.next!=null) {
        temp = temp.next;
        //newnode.next = null;
    }
    temp.next = newnode;
}
    public void display()
{
    node current=head;
    while(current!=null)
    {
        System.out.println(current.name);

        current=current.next;
    }
}
}

class Linkedlis
{
    public static void main(String[] args)
    {
        BusStop bs=new BusStop();
        bs.addStop("Rs");
        bs.addStop("VC");
        bs.addStop("MPL");
        bs.display();

    }
   }