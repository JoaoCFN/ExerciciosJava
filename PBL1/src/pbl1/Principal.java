package pbl1;

public class Principal {

    public static void main(String[] args) {
        Coach coach1 = new Coach();
        coach1.setAreaAtuacao("Carreira Profissional");
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");
        cliente1.setAreaNecessidade("carreira");
        
        Cliente cliente2 = new Cliente();
        cliente2.setAreaNecessidade("carreira Profissional");

        
        coach1.setQtsMaxClientes(1);
        System.out.println(coach1.getQtsMaxClientes());
        
        System.out.println(coach1.atribuiCliente(cliente1));
        System.out.println(coach1.atribuiCliente(cliente2));
        
    }
    
}
