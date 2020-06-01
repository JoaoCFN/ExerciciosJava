package bandasrock;


public class Banda {
    private String nomeBanda;
    private String tipoRock;
    private String localOrigem;
    private Musico musico;
    
    // Métodos
    public int obterTotalPontos(){
        return this.getMusico().getPontuacao();
    }
    
    // Construtor
    public Banda(Musico musico){
        this.setMusico(musico);
        this.musico.aumentaPontuacao();
    }
    
    // Getters
    public Musico getMusico(){
        return this.musico;
    }      
    
    public String getNomeBanda(){
        return this.nomeBanda;
    }
    
    public String getTipoRock(){
        return this.tipoRock;
    }
    
    public String getLocalOrigem(){
        return this.localOrigem;
    }
    
    // Setters
    public void setMusico(Musico musico){
        this.musico = musico;
    }   
    
    public void setNomeBanda(String nomeBanda){
        this.nomeBanda = nomeBanda;
    }
    
    public void setTipoRock(String tipoRock){
        this.tipoRock = tipoRock;
    }
    
    public void setLocalOrigem(String localOrigem){
        this.localOrigem = localOrigem;
    }
    
}
