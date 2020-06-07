package pbl1;

public class Principal {

    public static void main(String[] args) {
        // Coach
        Coach coach1 = new Coach();
        coach1.setNome("Fran");
        coach1.setQtsMaxClientes(2);
        coach1.setAreaAtuacao("Carreira Profissional");
        coach1.setAtendimentoVirtual(false);
        
        // Cliente 1
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");
        cliente1.setAreaNecessidade("carreira profissional");
        cliente1.setFormaAtendimento("Presencial");
        
        // Cliente 2
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Mateus");
        cliente2.setAreaNecessidade("carreira profissional");
        cliente2.setFormaAtendimento("Virtual");

        // Saídas
        System.out.println("==========================================");
        System.out.println("Coach");
        System.out.println("Nome: " + coach1.getNome());
        System.out.println("Quantidade máxima de clientes: " + coach1.getQtsMaxClientes());
        System.out.println("Área de atuação: " + coach1.getAreaAtuacao());
        System.out.println("Atendimento Virtual: " + coach1.getAtendimentoVirtual());
        System.out.println("==========================================");
        
        System.out.println("Cliente 1");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Status: " + coach1.atribuiCliente(cliente1));
        
        System.out.println("==========================================");
        
        System.out.println("Cliente 2");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Status: " + coach1.atribuiCliente(cliente2));
         
    }
    
}
