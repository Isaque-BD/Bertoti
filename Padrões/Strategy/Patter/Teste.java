public class Teste {

    public static void main(String[] args) {

        Sedex sedex = new Sedex();
        Frete frete = new Frete(sedex);

        Jadlog jadlog = new Jadlog();
        

        double valorSedex = frete.calcula(10);
        System.out.println(valorSedex);

    }
    
}
