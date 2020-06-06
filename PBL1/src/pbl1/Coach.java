package pbl1;
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
     
    
}
