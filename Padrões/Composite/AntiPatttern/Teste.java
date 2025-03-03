public class Teste {
    public static void main(String[] args) {
        Arquivo arquivo1 = new Arquivo("documento.txt");
        Arquivo arquivo2 = new Arquivo("Pedro.txt");
        Pasta pasta1 = new Pasta("Documentos");

        
        pasta1.adicionar(arquivo1);
        pasta1.exibir();
    }
}