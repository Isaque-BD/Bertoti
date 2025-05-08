import java.util.ArrayList;
import java.util.List;


public class SimpleTask implements Task{
    private String name;
    private boolean isDone;
    private List<Observer> observers = new ArrayList<>();

    public SimpleTask(String name){
        this.name = name;
        this.isDone = false;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void execute(){
        this.isDone = true;
        System.out.println("Executando tarefa: " + name);
        notifyObservers("Tarefa " + name + " foi executada.");

    }

    @Override
    public String getName(){
        return name; 
    }

    @Override
    public void notifyObservers(String message){
        for(Observer obs: observers){
            obs.update(message);
        }
    }
    
}
