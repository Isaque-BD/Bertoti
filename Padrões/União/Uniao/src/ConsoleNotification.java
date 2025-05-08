public class ConsoleNotification implements NotificationStrategy{
    @Override
    public void notify(String message){
        System.out.println("[CONSOLE] " + message);
    }
    
}
