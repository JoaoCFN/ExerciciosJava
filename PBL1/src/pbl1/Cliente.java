package pbl1;

/*

nome, 
área de necessidade (ex: profissional, acadêmica, etc - igual o de cima) 
e  se ele quer o atendimento exclusivamente virtual ou só presencial. 


*/
public class Cliente {
    private String nome;
    private String areaNecessidade;
    private String formaAtendimento;
    
    // Getters
    public String getNome() {
        return this.nome;
    }
   
    public String getAreaNecessidade() {
        return this.areaNecessidade;
    }
   
    public String getFormaAtendimento() {
        return this.formaAtendimento;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setAreaNecessidade(String areaNecessidade) {
        this.areaNecessidade = areaNecessidade;
    }
    
    public void setFormaAtendimento(String formaAtendimento) {
        this.formaAtendimento = formaAtendimento;
    }
    
    
}
