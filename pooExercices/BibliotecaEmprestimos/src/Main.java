public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Central");

        Livro l1 = new Livro("001", "Clean Code", "Robert Martin");
        Livro l2 = new Livro("002", "Harry Potter", "J.K. Rowling");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        // Emprestando o livro 001
        Livro livro = biblioteca.buscarLivroPorCodigo("001");
        livro.emprestar();

        System.out.println("\nLivros disponíveis:");
        biblioteca.listarLivrosDisponiveis();

        // Devolvendo o livro 001
        livro.devolver();

        System.out.println("\nResumo final:");
        biblioteca.exibirResumo();
    }
}