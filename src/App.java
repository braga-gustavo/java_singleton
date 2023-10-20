import java.util.List;

public class App {
    public class Main {
        public static void main(String[] args) {
            ClienteCadastro cadastro = ClienteCadastro.getInstance();
    
            // Adicionar clientes
            cadastro.adicionarCliente(new ClienteCadastro.Cliente("João", "joao@email.com"));
            cadastro.adicionarCliente(new ClienteCadastro.Cliente("Maria", "maria@email.com"));
    
            // Listar clientes
            List<ClienteCadastro.Cliente> clientes = cadastro.listarClientes();
            for (ClienteCadastro.Cliente cliente : clientes) {
                System.out.println("Nome: " + cliente.getNome() + ", Email: " + cliente.getEmail());
            }
        }
    }
}
