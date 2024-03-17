import java.util.Set;

public class Conta  extends Acesso{

    private String email;
    private String nomeCompleto;
    private int cpf;
    private int dataNascimento;
    private String login;
    private String senha;
    
    
    public void Cadastrar(String email, String nomeCompleto, int cpf, int dataNascimento, String login, String senha){

        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;

    }

    public void Login(String login, String senha){
        if(login == this.login && this.senha == senha ){
            System.out.println("Logado com sucesso");
        }else{
            System.out.println("O usuário ou senha está incorreto");
        }
    }

    public void RedefinirSenha(String senha){

        setSenha(this.senha);

    }
    

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    

    
}
