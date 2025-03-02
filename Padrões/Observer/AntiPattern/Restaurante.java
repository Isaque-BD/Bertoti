public class Restaurante {
    public static void main(String[] args){
        Cozinha cozinha = new Cozinha();
        Waiter waiter1 = new Waiter("Carlos");
        Waiter waiter2 = new Waiter("Ana");

        cozinha.addWaiter(waiter1);
        cozinha.addWaiter(waiter2);

        cozinha.orderReady("Pizza de palmito");
    }
    
}
