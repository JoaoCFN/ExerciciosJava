package bandasrock;

public class Musico {
    private String nome;
    private String instrumento;
    private int pontuacao;
    
    // Construtor
    // Toda vez que o músico for chamado na banda, ele ganha um ponto 
    /*
    public Musico(){
        this.setPontuacao(this.getPontuacao() + 1);
    }
    */
    
    public void aumentaPontuacao(){
        this.pontuacao += 1;
    }
    
    // Getters
    public String getNome(){
        return this.nome;
    }
    
    public String getInstrumento(){
        return this.instrumento;
    }
    
    public int getPontuacao(){
        return this.pontuacao;
    }
    
    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setInstrumento(String instrumento){
        this.instrumento = instrumento;
    }
    
    public void setPontuacao(int pontuacao){
        this.pontuacao = pontuacao;
    }
    
    
}
