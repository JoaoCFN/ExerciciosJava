package bandasrock;

public class Principal {

    public static void main(String[] args) {
        Musico musico1 = new Musico();
        Banda banda1 = new Banda(musico1);
        Banda banda2 = new Banda(musico1);
        System.out.println("Total de pontos da banda " + banda2.obterTotalPontos());
        System.out.println("Musico: " + musico1.getPontuacao());
     
        
    }
    
}
