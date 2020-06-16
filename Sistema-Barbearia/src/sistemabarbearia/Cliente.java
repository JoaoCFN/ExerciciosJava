package sistemabarbearia;

import java.util.ArrayList;

public class Cliente  {
    // ATRIBUTOS
    private String nome;
    private ArrayList<Barbeiro> barbeirosDisponiveis; //não coloquei "listaDeBarbeiros" para ajudar a diferencias as listas
    private int servico; //fica mais facil cadastrar e mostrar as opções na main
    private String nomeServico;
    private float valorServico;
    private int qtdPessoasAFrente;
    private String tempoEspera;

    // GETTERS
    public String getNome() {
        return nome;
    }

    public ArrayList<Barbeiro> getBarbeirosDisponiveis() {
        return barbeirosDisponiveis;
    }

    public int getServico() {
        return servico;
    }
    
    public String getNomeServico() {
        return nomeServico;
    }
    
    public float getValorServico() {
        return valorServico;
    }
    
    public int getQtdPessoasAFrente() {
        return qtdPessoasAFrente;
    }
    
    public String getTempoEspera() {
        return tempoEspera;
    }
    

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /* 
        ESTE MÉTODO RECEBE UMA BARBEARIA, PEGA A LISTA DE BARBEIROS EXISTENTES
        NELA E ATRIBUI NA LISTA DE BARBEIROS DISPONÍVEIS
    */
    public void setBarbeirosDisponiveis(Barbearia barbearia) {
        this.barbeirosDisponiveis = barbearia.getListaBarbeiros();
    }

    public void setServico(int servico) {
        this.servico = servico;
    }
    
    public void setValorServico(float valorServico) {
        this.valorServico = valorServico;
    }
    
    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }
    
    public void setQtdPessoasAFrente(int qtdPessoasAFrente) {
        this.qtdPessoasAFrente = qtdPessoasAFrente;
    }

    public void setTempoEspera(String tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

}
