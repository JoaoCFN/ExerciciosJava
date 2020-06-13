package prova;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int idade;
    private String email;
    private String level;
    private int moedas;
    private ArrayList<Jogo> jogos;
    
    // Construtor
    public Usuario(){
        this.jogos = new ArrayList<Jogo>();
    }
    
    // Getters e Setters
    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public String setJogos(Jogo jogo) {
        if(this.idade >= jogo.getIndicacao()){
            this.jogos.add(jogo);
            this.setMoedas();
            return "Jogo Adicionado";
        }
        else{
            return "Você é novo demais para jogar este jogo";
        }
    }
    
    public int getMoedas() {
        return moedas;
    }

    public void setMoedas() {
        if(this.jogos.size() > 0){
            int qtdJogos = this.jogos.size();
            
            if(this.level.equalsIgnoreCase("Profissional")){
                this.moedas = 50 * qtdJogos;
            }
            else{
                this.moedas = 20 * qtdJogos;
            }
        }
    }
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    // OUTROS MÉTODOS
    public void verificaLevel(){
        if(this.level.equalsIgnoreCase("Profissional")){
            // Criação do Ranking
            float ranking;
        }
    }
    
}
