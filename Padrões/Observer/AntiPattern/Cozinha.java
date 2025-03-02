import java.util.ArrayList;
import java.util.List;

public class Cozinha {

    private List<OrderObserver> orderObservers = new ArrayList<>();

    public void addWaiter(OrderObserver orderObserver){
        waiters.add(waiter);
    }

    public void orderReady(String order){
        for(OrderObserver oberserver: waiters){
            oberserver.notifyOrderReady(order);
        }
    }
}