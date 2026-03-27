public class LivrosBiblioteca {

    private String tituloLivro;
    private String autor;
    private boolean disponivel;
    private String nomeDoAluno;

    public LivrosBiblioteca(String tituloLivro, String autor) {
        this.tituloLivro = tituloLivro;
        this.autor = autor;
        this.disponivel = true;
        this.nomeDoAluno = null;

    }

    public void emprestarLivro(String nome){
        if(disponivel){
            nomeDoAluno = nome;
            disponivel = false;
            System.out.println("O livro " + tituloLivro + " foi emprestado para o aluno(a) " + nomeDoAluno);

        }else{
            System.out.println("Este livro " + tituloLivro + " nao esta disponivel no momento. ");
        }

    }

    public void devolver(){
        if(!disponivel){
            System.out.println(nomeDoAluno + " devolveu o livro " + tituloLivro);
            disponivel = true;
            nomeDoAluno = null;
            System.out.println("O livro " + tituloLivro + " esta disponviel. ");

        } else{
            System.out.println("Nao existe emprestimos disponiveis " );
        }
    }

    public void mostrarSituacao(){
        System.out.println("O livro " + tituloLivro + " esta " + (disponivel? "disponivel" : "indisponivel")); // pode ser feito um ternario nao ficar feio rrue e false
    }
}
