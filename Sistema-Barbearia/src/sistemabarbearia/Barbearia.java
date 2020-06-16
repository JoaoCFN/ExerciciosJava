package sistemabarbearia;

import java.util.ArrayList;

public class Barbearia {
    // INFORMAÇÕES FORMAIS DA EMPRESA
    private String nome;
    private String cnpj;
    private String endereco;
    // INFORMAÇÕES REFERENTE A RENDA E PAGAMENTOS
    private float faturamento;
    // LISTA DE FUNCIONÁRIOS
    private ArrayList<Barbeiro> listaBarbeiros; //mudei p facilitar a compreensão entre barbeiro e barbeiroS
    
    // CONSTRUTOR
    public Barbearia (){
        this.listaBarbeiros = new ArrayList<Barbeiro>();
    }
    
    // GETTERS
    public String getNome() {
        return nome;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public float getFaturamento() {
        return faturamento;
    }
       
    public ArrayList<Barbeiro> getListaBarbeiros() {
        return listaBarbeiros;
    }
    
    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /*
        O MÉTODO DE SETAR O FATURAMENTO PERCORRE A LISTA DE BARBEIROS E VERIFICA 
        O TOTAL DE DINHEIRO GANHO POR CADA UM AFIM DE CALCULAR O FATURAMENTO
    */
    public void setFaturamento() {
        //this.faturamento = faturamento;
        for(int i = 0; i < this.listaBarbeiros.size(); i++){
            this.faturamento += this.listaBarbeiros.get(i).getTotalDinheiroGanho();
        }
    }
     
    public void setListaBarbeiros(Barbeiro barbeiro) {
        this.listaBarbeiros.add(barbeiro);
    }
    
    // MÉTODOS DE TESTES
    public int numeroBarbeiros(){
        return this.listaBarbeiros.size();
    }
    
}
