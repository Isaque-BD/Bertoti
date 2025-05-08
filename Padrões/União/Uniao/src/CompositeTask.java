import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements Task{
    private String name;
    private List<Task> subtask = new ArrayList<>();
    private List<Observer> observers  = new ArrayList<>();

    public CompositeTask(String name){
        this.name = name;
    }
    
    public void addSubtask(Task task){
        subtask.add(task);
        for(Observer obs: observers){
            task.addObserver(obs);
        }
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

    @Override
    public void execute() {
        System.out.println("Executando tarefa composta: " + name);
        for (Task task : subtask) {
            task.execute();
        }
        notifyObservers("Tarefa composta '" + name + "' foi executada.");
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        for (Task task : subtask) {
            task.addObserver(observer); 
        }
    }
}
