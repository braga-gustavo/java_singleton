import java.util.ArrayList;
import java.util.List;

public class ClienteCadastro {

    private static ClienteCadastro instance;
    private List<Cliente> clientes;


    private ClienteCadastro() {
        clientes = new ArrayList<>();
    }

    // Método para obter a instância única
    public static ClienteCadastro getInstance() {
        if (instance == null) {
            instance = new ClienteCadastro();
        }
        return instance;
    }

    // Adicionar um cliente ao cadastro
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Listar todos os clientes
    public List<Cliente> listarClientes() {
        return clientes;
    }

    // Classe Cliente para representar informações do cliente
    public static class Cliente {
        private String nome;
        private String email;

        public Cliente(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }
    }
}
    

