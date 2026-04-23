public class Main {
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();
        System.out.println("Produto adicionado");
        catalogo.adicionarProduto();
        catalogo.procurarProduto("Camiseta");
    }
}
