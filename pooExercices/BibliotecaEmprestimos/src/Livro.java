public class Livro {

    private final String codigo;
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String codigo, String titulo, String autor) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código é obrigatório.");
        }
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título é obrigatório.");
        }
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("Autor é obrigatório.");
        }

        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }


    public void emprestar() {
        if (!disponivel) {
            throw new IllegalStateException("Livro já está emprestado.");
        }
        disponivel = false;
    }

    public void devolver() {
        if (disponivel) {
            throw new IllegalStateException("Livro já está disponível.");
        }
        disponivel = true;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}