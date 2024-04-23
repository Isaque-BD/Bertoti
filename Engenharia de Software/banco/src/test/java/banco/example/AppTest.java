package banco.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCadastroSucesso() throws CadastroException {
        String email = "valido@email.com";
        String nomeCompleto = "Usuário de Teste";
        int cpf = 123456789;
        int dataNascimento = 19900101;
        String login = "usuarioteste";
        String senha = "senha123";

        GerenciamentoConta gerenciamento = new GerenciamentoConta();
        gerenciamento.cadastrar(email, nomeCompleto, cpf, dataNascimento, login, senha);

        assertNotNull(gerenciamento.credenciais);
        assertEquals(login, gerenciamento.credenciais.getLogin());
    }

    @Test
    public void testLoginSucesso() throws CadastroException {
        String email = "valido@email.com";
        String nomeCompleto = "Usuário de Teste";
        int cpf = 123456789;
        int dataNascimento = 19900101;
        String login = "usuarioteste";
        String senha = "senha123";

        GerenciamentoConta gerenciamento = new GerenciamentoConta();
        gerenciamento.cadastrar(email, nomeCompleto, cpf, dataNascimento, login, senha);

        assertTrue(gerenciamento.login(login, senha));
    }

    @Test
    public void testLoginInvalido() throws CadastroException {
        String email = "valido@email.com";
        String nomeCompleto = "Usuário de Teste";
        int cpf = 123456789;
        int dataNascimento = 19900101;
        String login = "usuarioteste";
        String senha = "senha123";

        GerenciamentoConta gerenciamento = new GerenciamentoConta();
        gerenciamento.cadastrar(email, nomeCompleto, cpf, dataNascimento, login, senha);

        assertFalse(gerenciamento.login("usuarioerrado", senha));
        assertFalse(gerenciamento.login(login, "senhaincorreta"));
    }
}
