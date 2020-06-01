package catalogovirus;

import javax.swing.JOptionPane;

public class CatalogoVirus {

    public static void main(String[] args) {
        System.out.println("=================================");
        Virus virus1 = new Virus();
        virus1.setNome(JOptionPane.showInputDialog("Digite o nome do vírus"));
        virus1.setDataDescoberta(JOptionPane.showInputDialog("Digite a data da descoberta do vírus"));
        virus1.setGravidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a gravidade da doença")));
        virus1.setTaxaMortalidade(Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de mortalidade da doença")));
        
        /* Armazeno o valor em uma var antes para verificar a validade da 
           reposta do usuário.
        */
        String temVacina = JOptionPane.showInputDialog("Tem vacina? S/N");
        if(temVacina.equalsIgnoreCase("S")){
            virus1.setTemVacina(true);
        }
        else{
            virus1.setTemVacina(false);
        }
        
        /* Verifico as regras para classificação do vírus */
        virus1.verificaRegras();

        System.out.println("Doença:");
        System.out.printf("Nome do vírus: %s \n", virus1.getNome());
        System.out.printf("Data de descoberta do vírus: %s \n", virus1.getDataDescoberta());
        System.out.printf("Gravidade: %d \n", virus1.getGravidade());
        System.out.printf("Taxa de mortalidade do vírus: %.2f \n", virus1.getTaxaMortalidade());
        System.out.println("Tem vacina: " + virus1.getTemVacina());
        System.out.println("=================================");
                 
    }
}
