public class Teste {
    public static void main(String[] args) {
        Sedex sedex = new Sedex(2.3);
        double valorSedex = sedex.calcular();

        Jadlog jadlog = new Jadlog(3.3);
        double valorJadlog = jadlog.calcular();

        MercoSul mercoSul = new MercoSul(4.5);
        double valorMercoSul = mercoSul.calcular();

        System.out.println("Valor da Jadlog: R$" + valorJadlog);
        System.out.println("Valor do Sedex: R$" + valorSedex);
        System.out.println("Valor do MercoSul: R$" + valorMercoSul);

    }
}
