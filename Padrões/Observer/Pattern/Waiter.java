import java.nio.channels.Pipe.SourceChannel;

public class Waiter implements OrderObserver{
    private String name;

    public Waiter(String name){
        this.name = name;
    }
    
    public void notifyOrderReady(String order){
        System.out.println(name + " recebeu notificação: Pedido pronto -> " + order);
    }

    
}
