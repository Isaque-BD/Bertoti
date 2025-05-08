public class EmailNotification implements NotificationStrategy {
    private String emailAddress;

    public EmailNotification(String emailAddress){
        this.emailAddress = emailAddress;
    }

    @Override
    public void notify(String message){
        System.out.println("[EMAIL] Enviando para " + emailAddress + ": " + message);
    }
    
}
