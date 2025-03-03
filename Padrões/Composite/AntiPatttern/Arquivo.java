class Arquivo extends Componente {
    public Arquivo(String nome) {
        super(nome);
    }

    @Override
    public void exibir() {
        System.out.println("Arquivo: " + nome);
    }
}