public class Restaurante {
    public static void main(String[] args) {
        Cozinha  cozinha = new Cozinha();
        Waiter waiter1 = new Waiter("Pedro");
        Waiter waiter2 = new Waiter("Carlos");
        OrderMonitor monitor = new OrderMonitor();

        cozinha.addObserver(waiter1);
        cozinha.addObserver(waiter2);
        cozinha.addObserver(monitor);
        
        cozinha.orderReady("Pizza 4 queijos");

    }
    
}
