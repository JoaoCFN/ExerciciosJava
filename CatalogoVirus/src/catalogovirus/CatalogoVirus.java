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
        System.out.println("Doença:");
        System.out.printf("Nome do vírus: %s \n", virus1.getNome());
        System.out.printf("Data de descoberta do vírus: %s \n", virus1.getDataDescoberta());
        System.out.printf("Data de gravidade: %d \n", virus1.getGravidade());
        System.out.printf("Taxa de mortalidade do vírus: %.2f \n", virus1.getTaxaMortalidade());
        System.out.println("Tem vacina: " + virus1.getTemVacina());
        System.out.println("=================================");
             
        Virus virus2 = new Virus();
        virus2.setNome("Dengue");
        virus2.setDataDescoberta("23/03/2014");
        virus2.setGravidade(3);
        virus2.setTaxaMortalidade(0.5f);
        
        System.out.printf("Nome do vírus: %s \n", virus2.getNome());
        System.out.printf("Data de descoberta do vírus: %s \n", virus2.getDataDescoberta());
        System.out.printf("Data de gravidade: %d \n", virus2.getGravidade());
        System.out.printf("Taxa de mortalidade do vírus: %f \n", virus2.getTaxaMortalidade());
        System.out.println("Tem vacina: " + virus2.getTemVacina());
        System.out.println("=================================");
             
        
        
    }

    
}
