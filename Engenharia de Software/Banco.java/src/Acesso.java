public abstract class Acesso {

    private float dinheiro;

    public void Depositar(float money) {

        setDinheiro(getDinheiro() + money);
        System.out.println("Você depositou: " + money);

    }

    public void Investir(float investiu) {

        if (getDinheiro() >= 1) {
            System.out.println();
            setDinheiro(getDinheiro() - investiu);
            System.out.println("Você investiu " + investiu);
        } else {
            System.out.println("Dinheiro insuficiente");
        }

    }

    public void Sacar(float sacar) {
        if (getDinheiro() >= sacar) {
            setDinheiro(getDinheiro() - sacar);
            System.out.println("Você sacou " + sacar);
        }
    }

    public void Total() {
        System.out.println(getDinheiro());
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

}
