import java.util.ArrayList;
import java.util.List;

class Pasta extends Componente {
    private List<Componente> componentes = new ArrayList<>();

    public Pasta(String nome) {
        super(nome);
    }

    @Override
    public void exibir() {
        System.out.println("Pasta: " + nome);
        for (Componente c : componentes) {
            c.exibir();
        }
    }

    public void adicionar(Componente c) {
        componentes.add(c);
    }

    public void remover(Componente c) {
        componentes.remove(c);
    }
}
