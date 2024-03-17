public class App {
    public static void main(String[] args) throws Exception {

        Conta c1 = new Conta();
        c1.Cadastrar("pedro@gmail.com", "Pedro Alberto", 12345678, 14042005, "pedro", "123");
        c1.Login("pedro", "123");
        c1.Depositar(1000);
        c1.Investir(100);
        c1.Sacar(500);
        c1.Total();
        
        
    }
}
