package Pattern;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Componente {
    private String name;
    private List<Componente> componentes = new ArrayList<>(); // Lista para armazenar Arquivos e outras Pastas

    public Pasta(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("Pasta: " + name);
        for (Componente c : componentes) {
            c.show(); 
        }
    }

    @Override
    public void add(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public void remove(Componente componente) {
        componentes.remove(componente); 
    }
}
