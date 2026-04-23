import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private ArrayList<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }


    public void adicionarLivro(Livro livro) {

        for (Livro livros : this.livros) {
            if (livros.getCodigo().equalsIgnoreCase(livros.getCodigo())) {
                System.out.println("Código já existe: " + livros.getCodigo());
                return;
            }
        }

        livros.add(livro);
    }

    public Livro buscarLivroPorCodigo(String codigo) {

        for (Livro livros : livros) {
            if (livros.getCodigo().equalsIgnoreCase(codigo)) {
                return livros;
            }
        }

        return null;
    }

    public void listarLivrosDisponiveis() {

        for (Livro livros : livros) {
            if (livros.isDisponivel()) {
                System.out.println(livros.getCodigo() + " - " + livros.getTitulo());
            }
        }
    }


    public void exibirResumo() {
        System.out.println("\n--- Biblioteca: " + nome + " ---");

        for (Livro livros : livros) {
            String status = livros.isDisponivel() ? "Disponivel" : "Emprestado";
            System.out.println(livros.getCodigo() + " | " + livros.getTitulo() + " | " + livros.getAutor() + " | " + status);
        }
    }
}