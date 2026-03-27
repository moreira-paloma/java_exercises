package exerciciosPoo;

public class Livros {

    private String titulo;
    private String autor;
    private double preco;

    public Livros() {
        this.titulo = "Titulo Indefinido";
        this.preco = 0.0;
    }
    public Livros(String titulo,String autor,double precos){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = precos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void Status(){
        System.out.println("O livro é : " + this.titulo);
        System.out.println("O autor é : " + this.autor);
        System.out.println("O preco é : " + this.preco);
    }
}
