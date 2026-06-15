package ethno.Threadss;

class orderpizza extends Thread{
    public orderpizza(String name)
    {
        super(name);
    }
    public void run(){
        try{
            Thread.sleep(5000);
            System.out.println("Pizza is ready");
        }
        catch(Exception e)
        {
            System.out.println("Sorry "+getName()+"failed to make it ready");
    }
}
}
public class pizza {
    public static void main(String[] args) {
    orderpizza o=new orderpizza("hema");
    orderpizza o1=new orderpizza("latha");
    o.setPriority(Thread.MAX_PRIORITY);
    o1.setPriority(Thread.MAX_PRIORITY);

    o.start();
    o1.start();


    }
    
}
