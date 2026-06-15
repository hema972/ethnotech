package ethno.Threadss;

class messagesender extends Thread{
    public messagesender(String name)
    {
        super(name);
    }
    public void run(){
        try{
            for(int i=0;i<2;i++)
            {
                System.out.println(getName()+"Sending message"+i);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Interupted Exception"+e);
        }
        System.out.println("Message is sent");
    }
}


public class MessageApp {
    public static void main(String[] args) throws Exception{
        messagesender sender=new messagesender("hema");
        messagesender sender1=new messagesender("Latha");

        System.out.println("Sender started to send a message"+sender.getName(),sender2.getName());
        sender.setPriority(Thread.MAX_PRIORITY);
        sender1.setPriority(Thread.MAX_PRIORITY);

        sender.start();
        sender1.start();
        System.out.println(sender.getState());
        System.out.println(sender1.getState());
        System.out.println(sender.isAlive());
        System.out.println(sender1.isAlive());

    }

    
}
