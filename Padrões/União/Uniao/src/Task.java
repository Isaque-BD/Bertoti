public interface Task {
    public void execute();
    public String getName();
    public void addObserver(Observer observer);
    public void notifyObservers(String message);
}
