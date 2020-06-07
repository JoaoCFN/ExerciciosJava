package pbl1;

import java.util.ArrayList;

/*
    nome, 
    os coachees que acompanha, 
    quantidade máxima de coachees que pode auxiliar, 
    se pode fazer atendimento virtual ou não 
    e a área de atuação 

    (ex: coach de carreira profissional, carreira acadêmica, sentimentos, 
    esportivo, etc)

*/
public class Coach {
    private String nome;
    private String areaAtuacao;
    private int quantidadeMaximaClientes;
    private boolean atendimentoVirtual;
    private ArrayList<Cliente> clientes;
    
    // Construtor
    public Coach(){
        this.clientes = new ArrayList<Cliente>();
    }
    
    // Getters
    public String getNome(){
        return this.nome;
    }
    
    public String getAreaAtuacao(){
        return this.areaAtuacao;
    }
    
    public int getQtsMaxClientes(){
        return this.quantidadeMaximaClientes;
    }
    
    public boolean getAtendimentoVirtual(){
        return this.atendimentoVirtual;
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }
    
    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setAreaAtuacao(String areaAtuacao){
        this.areaAtuacao = areaAtuacao;
    }
    
    public void setQtsMaxClientes(int quantidadeMaximaClientes){
        this.quantidadeMaximaClientes = quantidadeMaximaClientes;
    }
    
    public void setAreaAtuacao(boolean atendimentoVirtual){
        this.atendimentoVirtual = atendimentoVirtual;
    }
    
    private void setCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    public String atribuiCliente(Cliente cliente){
        if(this.clientes.size() < this.quantidadeMaximaClientes){
            if(cliente.getAreaNecessidade().equalsIgnoreCase(this.areaAtuacao)){
                this.setCliente(cliente);
                return "Deu certo!";
            }
            
            return "Incompatibilidade de coach, pois não é da mesma área de interesse.";
        }
        
        return "Incompatibilidade de coach, pois o número de clientes foi atingido.";
        
    }
    
    
     
    
}
