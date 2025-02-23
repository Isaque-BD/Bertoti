public class Frete {
    private Metodos servico;

    public Frete(Metodos servico) {
        this.servico = servico;
    }

    public double calcula(double distancia){
       return servico.calcular(distancia);
    }
}
    