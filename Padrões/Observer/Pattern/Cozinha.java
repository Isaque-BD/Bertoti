import java.util.ArrayList;
import java.util.List;

public class Cozinha {
    private List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer){
        observers.add(observer);
    }

    public void orderReady(String order){
        for(OrderObserver observer: observers){
            observer.notifyOrderReady(order);
        }
    }
    
}
