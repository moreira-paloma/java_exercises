package exerciciosPoo;

public class LivrosRun {
    public static void main(String[] args) {

        Livros livro1 = new Livros("Romeu","Zeca", 10.00);
        livro1.Status();
        System.out.println("___________________");

        Livros livro2 = new Livros();
        livro2.Status();
    }
}
