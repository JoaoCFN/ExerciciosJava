package pbl1;

public class Principal {

    public static void main(String[] args) {
        Coach coach1 = new Coach();
        coach1.setAreaAtuacao("Carreira Profissional");
        coach1.setAtendimentoVirtual(false);
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");
        cliente1.setAreaNecessidade("carreira profissional");
        cliente1.setFormaAtendimento("Presencial");
        
        Cliente cliente2 = new Cliente();
        cliente2.setAreaNecessidade("carreira");

        coach1.setQtsMaxClientes(1);
        
        System.out.println(coach1.atribuiCliente(cliente1));
        //System.out.println(coach1.atribuiCliente(cliente2));
        
        System.out.println(coach1.tamanhoArray());
        
    }
    
}
