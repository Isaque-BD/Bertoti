public class Main {
    public static void main(String[] args) {
        // Estratégias de notificação
        NotificationStrategy email = new EmailNotification("joao@example.com");
        NotificationStrategy console = new ConsoleNotification();

        // Observadores
        TeamMember joao = new TeamMember("João", email);
        TeamMember maria = new TeamMember("Maria", console);

        // Tarefas
        SimpleTask tarefa1 = new SimpleTask("Escrever documentação");
        SimpleTask tarefa2 = new SimpleTask("Implementar API");

        CompositeTask projeto = new CompositeTask("Projeto X");
        projeto.addSubtask(tarefa1);
        projeto.addSubtask(tarefa2);

        // Adiciona observadores à tarefa composta (propaga para as subtarefas)
        projeto.addObserver(joao);
        projeto.addObserver(maria);

        // Executa a tarefa composta
        projeto.execute();
    }
}
