package bandasrock;

import java.util.ArrayList;


public class Banda {
    private String nomeBanda;
    private String tipoRock;
    private String localOrigem;
    private ArrayList<Musico> musicos;
    
    // Métodos
    public int obterTotalPontos(){
        //return this.getMusico().getPontuacao();
        int totalPontos = 0;
        for(int i = 0; i < musicos.size(); i++){
            totalPontos += this.musicos.get(i).getPontuacao();
        }
        return totalPontos;
    }
    

    // Toda vez que um músico for setado ele ganha +1 de pontuação
    public void adicionaPontuacao(){
        for(int i = 0; i < musicos.size(); i++){
            this.musicos.get(i).aumentaPontuacao();
        }
    }
    
    // Getters
    public ArrayList<Musico> getMusico(){
        return this.musicos;
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
    public void setMusico(ArrayList<Musico> musicos){
        this.musicos = musicos;  
        this.adicionaPontuacao();
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
