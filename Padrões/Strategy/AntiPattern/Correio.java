public class Correio {
    private double preco;
    private double distancia;

    public Correio(double preco, double distancia) {
        this.preco = preco;
        this.distancia = distancia;
    }

    public double calcular(){
        return this.getPreco() * this.getDistancia();
    }

    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getDistancia() {
        return distancia;
    }
    
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


    
    
}