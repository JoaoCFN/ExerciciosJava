package bandasrock;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        Musico musico1 = new Musico();
        musico1.setNome("JP Oliveira");
        musico1.setInstrumento("Violão"); 
        
        Musico musico2 = new Musico();
        musico2.setNome("Marcelo Falcão");
        musico2.setInstrumento("Baterista"); 

        ArrayList<Musico> musicos = new ArrayList<Musico>();
        musicos.add(musico1);
        musicos.add(musico2);      
        
        Banda banda1 = new Banda();
        banda1.setNomeBanda("Metaleiros");
        banda1.setTipoRock("Metal");
        banda1.setLocalOrigem("Feira de Santana");
        banda1.setMusico(musicos);
        
        System.out.println("Total de pontos da banda " + banda1.getPontuacaoBanda());
        
        System.out.println("\nMusico 1: \nnome: " + musico1.getNome());
        System.out.println("Instrumento: " + musico1.getInstrumento());
        System.out.println("Pontuação: " + musico1.getPontuacao());
        
        System.out.println("\nMusico 2: \nnome: " + musico2.getNome());
        System.out.println("Instrumento: " + musico2.getInstrumento());
        System.out.println("Pontuação: " + musico2.getPontuacao());
    }
    
}
