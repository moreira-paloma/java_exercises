package jogoSemPoo;

public class JogoSemPoo {
    public static void main(String[] args) {

        String personagem1 = "Kratos";
        int vida1 = 100;
        int forca1 = 25;
        String arma1 = "Lamina do Caos";

        String personagem2 = "Minotauro";
        int vida2 = 150;
        int forca2 = 15;
        String arma2 = "Machado Gigante";

        System.out.println("Iniciando a luta ");
        System.out.println(personagem1 + " (Vida: " + vida1 + ") vs " + personagem2 + " (Vida: " + vida2 + ")");
        System.out.println("\n" + personagem1 + " ataca " + personagem2 + " usando " + arma1 + "!");
        vida2 = vida2 - forca1;
        System.out.println(personagem2 + " revida atacando " + personagem1 + " usando " + arma2 + "!");
        vida1 = vida1 - forca2;
        System.out.println("\n--- Status Final ---");
        System.out.println(personagem1 + " | Vida restante: " + vida1);
        System.out.println(personagem2 + " | Vida restante: " + vida2);
    }
}
