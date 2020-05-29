package catalogovirus;

public class Virus {
    private String nome;
    private String dataDescoberta;
    private int gravidade;
    private float taxaMortalidade;
    private boolean temVacina;
    
    /* Construtor */
    public Virus(){
        this.temVacina = false;
    }
    
    /* Setters */
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDataDescoberta(String dataDescoberta){
        this.dataDescoberta = dataDescoberta;
    }
    
    public void setGravidade(int gravidade){
        this.gravidade = gravidade;    
    }
    
    public void setTaxaMortalidade(float taxaMortalidade){
        this.taxaMortalidade = taxaMortalidade;
    }
    
    public void setTemVacina(boolean temVacina){
        this.temVacina = temVacina;
    }
    
    /* Getters */
    public String getNome(){
        return this.nome;
    }
    
    public String getDataDescoberta(){
        return this.dataDescoberta;
    }
    
    public int getGravidade(){
        return this.gravidade;  
    }
    
    public float getTaxaMortalidade(){
        return this.taxaMortalidade;
    }
    
    public boolean getTemVacina(){
        return this.temVacina;
    }
    
    /* Regras para classificação do virus */
    
    
}

