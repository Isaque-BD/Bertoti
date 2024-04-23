package banco.example;

import java.util.regex.Pattern;

class GerenciamentoConta {

    Credenciais credenciais; 

    public void cadastrar(String email, String nomeCompleto, int cpf, int dataNascimento, String login, String senha) throws CadastroException {


        credenciais = new Credenciais(login, senha);

        System.out.println("Dados cadastrados com sucesso: ");
        System.out.println("Email: " + email);
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("CPF: " + cpf); 
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Login: " + login);
        System.out.println("Senha: " + senha); 
    }

    public boolean login(String login, String senha) {
        if (credenciais == null || !credenciais.getLogin().equals(login) || !credenciais.getSenha().equals(senha)) {
            return false;
        }

        return true;
    }

   
}