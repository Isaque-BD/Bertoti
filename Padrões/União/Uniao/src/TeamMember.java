public class TeamMember implements Observer {
    private String name;
    private NotificationStrategy notificationStrategy;

    public TeamMember(String name, NotificationStrategy notificationStrategy) {
        this.name = name;
        this.notificationStrategy = notificationStrategy;
    }

    public void setNotificationStrategy(NotificationStrategy strategy) {
        this.notificationStrategy = strategy;
    }

    @Override
    public void update(String message) {
        System.out.println("Notificando membro: " + name);
        notificationStrategy.notify(message);
    }
}
