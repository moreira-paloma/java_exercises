public class Main {
    public static void main(String[] args) {

        ProdutoEstoque produtoEstoque = new ProdutoEstoque("Camiseta Selecao Brasileira", 10, 5);
        ProdutoEstoque produtoEstoque1 = new ProdutoEstoque("Chuteira Adidas", 20, 3);
        ProdutoEstoque produtoEstoque2 = new ProdutoEstoque("Boné Nike", 30, 5);

        produtoEstoque.adicionarEstoque(5);
        produtoEstoque.retirarEstoque(15);
        produtoEstoque.estaAbaixoMinimo();
        produtoEstoque.exibirRelatorio();
    }
}
