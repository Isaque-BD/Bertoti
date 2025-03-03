package Pattern;

public class Arquivo implements Componente{
    private String name;

    public Arquivo(String name){
        this.name = name;
    }

    @Override
    public void show(){
        System.out.println("Arquivo " + name);
    }

    @Override
    public void add(Componente componente){
        throw new UnsupportedOperationException("Arquivo não pode adicionar");
    }

    @Override
    public void remove(Componente componente){
        throw new UnsupportedOperationException("Arquivo não pode ser auto-deletado");
    }

    
}
