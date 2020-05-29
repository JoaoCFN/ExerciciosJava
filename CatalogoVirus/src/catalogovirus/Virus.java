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
    public void verificaRegras(){
        /*
            Caso não haja vacina e a taxa de mortalidade já 
            tenha atingido 0.5, a gravidade, automaticamente, 
            deve ser configurada para 5.
        */
        if(this.temVacina == false && this.taxaMortalidade >= 0.5){
            this.setGravidade(5);
           
        }
        /*
            Caso a taxa de mortalidade seja menor que 0.5, mas 
            não tenha vacina, a gravidad
        */
        else if(this.temVacina == false && this.taxaMortalidade < 0.5){
            this.setGravidade(4);
           
        }
        /*
            Se houver vacina e a taxa de mortalidade estiver 
            acima de 0.5, a gravidade é 3.
        */
        else if(this.temVacina == true && this.taxaMortalidade >= 0.5){
            this.setGravidade(3);
           
        }
        /*
            Taxa de mortalidade entre 0.2 e 0.4 a gravidade é 2.
        */
        else if(this.temVacina == true){
            if(this.taxaMortalidade >= 0.2 && this.taxaMortalidade < 0.5){
                this.setGravidade(2);
            }
        }
        /*
            Taxa de mortalidade abaixo de 0.2, a gravidade é 1.
        */
        else if(this.temVacina == true && this.taxaMortalidade < 0.2){
            this.setGravidade(1);
        }
    }  
}

