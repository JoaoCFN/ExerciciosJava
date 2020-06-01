package bandasrock;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        Musico musico1 = new Musico();
        Musico musico2 = new Musico();

        ArrayList<Musico> musicos = new ArrayList<Musico>();
        musicos.add(musico1);
        musicos.add(musico2);      
        
        Banda banda1 = new Banda();
        banda1.setMusico(musicos);
      
        System.out.println("Total de pontos da banda " + banda1.obterTotalPontos());
        System.out.println("Musico 1: " + musico1.getPontuacao());
        System.out.println("Musico 2: " + musico2.getPontuacao());          
    }
    
}
