package Pattern;

public class Teste {
    public static void main(String[] args) {
        Pasta pasta = new Pasta("Frutas");
        Arquivo arquivo = new Arquivo("Ameixa");

        pasta.add(arquivo);
        pasta.show();
    }
    
}


