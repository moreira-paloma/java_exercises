public class Main {
    public static void main(String[] args) {

        LivrosBiblioteca livros = new LivrosBiblioteca("German Grammar", "Hueber editora");

        livros.mostrarSituacao();
        livros.emprestarLivro("Pedro");
        livros.mostrarSituacao();
        livros.devolver();
        livros.mostrarSituacao();

    }
}


// perguntar de novo porque eu nao preciso chamar um get, se livrosBiblioteca esta com os atributos private.