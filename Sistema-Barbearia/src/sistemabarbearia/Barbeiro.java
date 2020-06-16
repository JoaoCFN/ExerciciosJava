package sistemabarbearia;

import java.util.ArrayList;

public class Barbeiro  {
    // ATRIBUTOS
    private String nome;
    private double tempoFila; //Mudei p double pois o tempo pode ser 1:30
    private float totalDinheiroGanho = 0;
    private ArrayList<Cliente> listaClientes; //Mudei p facilitar a diferença entre cliente e clientes

    // CONSTRUTOR
    public Barbeiro() {
        this.listaClientes = new ArrayList<Cliente>();
    }
    
    // GETTERS
    public String getNome() {
        return nome;
    }
    
    public double getTempoFila() {
        return tempoFila;
    }
       
    public float getTotalDinheiroGanho() {
        return totalDinheiroGanho;
    }
    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTempoFila(int tempoFila) {
        this.tempoFila += tempoFila;
    }
      
    public void setTotalDinheiroGanho(float totalDinheiroGanho) {
        this.totalDinheiroGanho += totalDinheiroGanho;
    }
       
    public void setListaClientes(Cliente cliente) {
        /*
            TODA VEZ QUE UM CLIENTE FOR SETADO NO ARRAY DE UM BARBEIRO, O PROGRAMA
            CALCULA O TEMPO ESTIMADO NA FILA DE ACORDO COM O SERVIÇO ESCOLHIDO PELO MESMO
        */
        int qtdClientesFila = this.listaClientes.size();
        
        /*
            SE A QUANTIDADE DE CLIENTES NA FILA FOR IGUAL A 0 ELE SERÁ O PRIMEIRO
            E OS DADOS SERÃO SETADOS. CASO JÁ NÃO SEJA MAIS O PRIMEIRO, O PROGRAMA SETA OUTRAS 
            INFORMAÇÕES PARA O CLIENTE
        */
        
        if(qtdClientesFila == 0){
            cliente.setQtdPessoasAFrente(qtdClientesFila);
            cliente.setTempoEspera("Você é o primeiro da fila");
        }
        else{
            cliente.setQtdPessoasAFrente(qtdClientesFila);
            cliente.setTempoEspera("Tempo de espera: " + this.getTempoFila() + " minutos");           
        }
        
        this.listaClientes.add(cliente);
        this.calculaServico(cliente);
        
    }
    
    // OUTROS MÉTODOS
    public void calculaServico(Cliente cliente){ //METODO P MOSTRAR O TEMPO NA FILA P OS CLIENTES
        
        switch (cliente.getServico()) {
            case 1:
                //Barba
                // 20 minutos
                // 10 reais
                this.tempoFila += 20;
                this.setTotalDinheiroGanho(10);
                cliente.setNomeServico("Barba");
                cliente.setValorServico(10);
                break;
            case 2:
                // Cabelo na máquina
                // 40 minutos
                // 15 reais
                this.tempoFila += 40;
                this.setTotalDinheiroGanho(15);
                cliente.setNomeServico("Cabelo na máquina");
                cliente.setValorServico(15);
                break;
            case 3:
                // Cabelo na tesoura
                // 1 hora
                // 20 reais
                this.tempoFila += 60;
                this.setTotalDinheiroGanho(20);
                cliente.setNomeServico("Cabelo na tesoura");
                cliente.setValorServico(20);
                break;
            case 4:
                // Serviço completo
                // 1 hora e 40 minutos
                // 35 reais
                this.tempoFila += 90;
                this.setTotalDinheiroGanho(35);
                cliente.setNomeServico("Serviço completo");
                cliente.setValorServico(35);
                break;
            default:
                break;
        }
    }
        
    // MÉTODOS DE TESTES
    public int numeroClientes(){
        return this.listaClientes.size();
    }
}
