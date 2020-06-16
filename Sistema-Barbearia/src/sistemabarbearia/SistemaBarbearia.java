package sistemabarbearia;

import javax.swing.JOptionPane;

public class SistemaBarbearia {

    
    public static void main(String[] args) {
        // BABEARIA
        Barbearia barbearia1 = new Barbearia();
        barbearia1.setNome("Barbearia do Toinho");
        barbearia1.setCnpj("000.000.0000/000-20");
        barbearia1.setEndereco("Rua da ponte, Queimadinha");
        
        // BARBEIROS
        Barbeiro barbeiro1 = new Barbeiro();
        barbeiro1.setNome("João Carlos");
        Barbeiro barbeiro2 = new Barbeiro();
        barbeiro2.setNome("Genivaldo");
        
        // Adiciona os barbeiros
        barbearia1.setListaBarbeiros(barbeiro1);
        barbearia1.setListaBarbeiros(barbeiro2);
        
        /*
            DENTRO DA MAIN HOJE, TEMOS APENAS O INTERFACE DO USUÁRIO
        */
        
        int opcaoUsuario = 0;
        
        // ENQUANTO O USUÁRIO NÃO FECHAR, O PROGRAMA RODARÁ 
        while(opcaoUsuario != -1){
            // PRIMEIRO O USUÁRIO INFORMA SE ELE É BARBEIRO OU CLIENTE
            String[] opcoesUsuario = {"Se cadastrar", "Fechar"};
            opcaoUsuario = JOptionPane.showOptionDialog(null, 
                    "      " +  barbearia1.getNome(),
                    "Seja Bem vindo",
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE, 
                    null, opcoesUsuario, 
                    opcoesUsuario[0]
            );
            
            switch(opcaoUsuario){
                case 0:           
                    // CLIENTES
                    Cliente cliente = new Cliente();

                    cliente.setNome(JOptionPane.showInputDialog("Digite seu nome"));

                    // OPÇÕES DE SERVIÇO
                    JOptionPane.showMessageDialog(null, 
                        "Nossos serviços \n" +
                        "Barba - R$10 - 20 minutos \n" +
                        "Cabelo na máquina - R$15 - 40 minutos \n" +
                        "Cabelo na tesoura - R$20 - 1H \n" +
                        "Serviço completo - R$35 - 1H E 40 minutos \n" 
                    );

                    // ESCOLHENDO O SERVIÇO
                    String[] servicos = {"Barba", "Cabelo na máquina", "Cabelo na tesoura", "Serviço completo"};
                    int opcaoServico = JOptionPane.showOptionDialog(null, "Serviços",
                        "Escolha o serviço",
                        JOptionPane.DEFAULT_OPTION, 
                        JOptionPane.INFORMATION_MESSAGE, 
                        null, 
                        servicos, 
                        servicos[0]
                    );
                                                         
                    // SETA O SERVIÇO ESCOLHIDO
                    switch(opcaoServico){
                        case 0:
                            cliente.setServico(1);
                            break;
                        case 1:
                            cliente.setServico(2);
                            break;
                        case 2:
                            cliente.setServico(3);
                            break;
                        case 3:
                            cliente.setServico(4);
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada");
                            break;
                    }

                    // PASSA A BARBEARIA PARA BUSCAR OS BARBEIROS DISPONÍVEIS
                    cliente.setBarbeirosDisponiveis(barbearia1);
                    
                    // CONTROI UM ARRAY QUE IRÁ RECEBER TODOS OS BARBEIROS DISPONÍVEIS NA BARBEARIA 
                    String[] listaBarbeirosDisponiveis = new String[cliente.getBarbeirosDisponiveis().size()];
                    
                    // PREENCHE O ARRAY DE BARBEIROS DISPONÍVEIS NA BARBEARIA 
                    for(int i = 0; i < cliente.getBarbeirosDisponiveis().size(); i++){
                         listaBarbeirosDisponiveis[i] = cliente.getBarbeirosDisponiveis().get(i).getNome();
                    }
                    
                    // Captura qual barbeiro foi escolhido pelo usuário
                    int barbeiroEscolhido = JOptionPane.showOptionDialog(null, "Barbeiros disponíveis",
                        "Escolha o barbeiro",
                        JOptionPane.DEFAULT_OPTION, 
                        JOptionPane.INFORMATION_MESSAGE, 
                        null, 
                        listaBarbeirosDisponiveis, 
                        listaBarbeirosDisponiveis[0]
                    );                  
                    
                    // ADICIONA O CLIENTE A LISTA
                    //cliente1.getBarbeirosDisponiveis().get(barbeiroEscolhido).setListaClientes(cliente1);
                    barbearia1.getListaBarbeiros().get(barbeiroEscolhido).setListaClientes(cliente);
                    
                    JOptionPane.showMessageDialog(null, 
                        "Nome: " + cliente.getNome() + "\n" +
                        "Tipo de serviço: " + cliente.getNomeServico()+ "\n" +
                        "Valor do serviço: R$" + cliente.getValorServico() + "\n" +
                        "Barbeiro escolhido: " + cliente.getBarbeirosDisponiveis().get(barbeiroEscolhido).getNome() + "\n" +
                        cliente.getTempoEspera() + "\n" +
                        "Quantidade de pessoas na sua frente: " + cliente.getQtdPessoasAFrente()  
                    );
                    
                break;
                
                case 1:
                    JOptionPane.showMessageDialog(null, "Muito obrigado por usar nosso programa");
                    opcaoUsuario = -1;
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Você fechou o programa");
                break;
            }
              
        }
        
        barbearia1.setFaturamento();
                    
        /*
            TESTE NO CONSOLE
        */
        // Dados barbearia
        System.out.println("---------------------------------------");
        System.out.println("Barbearia");
        System.out.println("---------------------------------------");
        
        System.out.println("Nome: " + barbearia1.getNome());
        System.out.println("CNPJ: " + barbearia1.getCnpj());
        System.out.println("Endereço: " + barbearia1.getEndereco());
        System.out.println("Faturamento: R$" + barbearia1.getFaturamento());
        System.out.println("Número barbeiros: " + barbearia1.numeroBarbeiros());

        // Dados barbeiro
        System.out.println("---------------------------------------");
        System.out.println("Barbeiros");
        System.out.println("---------------------------------------");
        System.out.println("Nome: " + barbeiro1.getNome());
        System.out.println("Total de dinheiro de ganho: R$" + barbeiro1.getTotalDinheiroGanho());
        System.out.println("Quantidade de pessoas na fila: " + barbeiro1.numeroClientes());
        System.out.printf("Tempo de fila: %.2f \n", barbeiro1.getTempoFila());

        System.out.println("***************************************");

        System.out.println("Nome: " + barbeiro2.getNome());
        System.out.println("Total de dinheiro de ganho: R$" + barbeiro2.getTotalDinheiroGanho());
        System.out.println("Quantidade de pessoas na fila: " + barbeiro2.numeroClientes());
        System.out.printf("Tempo de fila: %.2f \n", barbeiro2.getTempoFila());


        System.out.println("---------------------------------------");
        System.out.println("Clientes");
        System.out.println("---------------------------------------");
        
        for(int i = 0; i < barbeiro1.getListaClientes().size(); i++){
            System.out.println(barbeiro1.getListaClientes().get(i).getNome());
        }
        
        for(int i = 0; i < barbeiro2.getListaClientes().size(); i++){
            System.out.println(barbeiro2.getListaClientes().get(i).getNome());
        }
        
    }
    
}
