package prova;

public class Prova {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.setNome("João");
        usuario1.setIdade(18);
        usuario1.setLevel("Profissional");
        usuario1.setEmail("joao100@hotmail.com");
        usuario1.verificaLevel();
        
        
        Jogo jogo1 = new Jogo();
        jogo1.setNome("The last of us part II");
        jogo1.setIndicacao(18);
        jogo1.setGrauDificuldade("Profissional");
        
        Jogo jogo2 = new Jogo();
        jogo2.setNome("God of war");
        jogo2.setIndicacao(18);
        jogo2.setGrauDificuldade("Profissional");
        
        Jogo jogo3 = new Jogo();
        jogo3.setNome("Mario");
        jogo3.setIndicacao(10);
        jogo3.setGrauDificuldade("Profissional");
         
        System.out.println("===============================");
        System.out.println(usuario1.getNome());
        System.out.println(usuario1.getIdade());
        System.out.println(usuario1.getLevel());
        System.out.println("===============================");
        System.out.println(usuario1.setJogos(jogo1));
        System.out.println("===============================");
        System.out.println(usuario1.setJogos(jogo2));
        System.out.println("===============================");
        System.out.println(usuario1.setJogos(jogo3));
        System.out.println("===============================");
        System.out.println("Quantidade de moedas: " + usuario1.getMoedas());
        
        
        
    }
    
}
