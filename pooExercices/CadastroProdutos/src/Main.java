public class Main {
    public static void main(String[] args) {

        ProdutosEstoque produtosEstoque = new ProdutosEstoque("1","Arroz Integral", 10.0,100);

        produtosEstoque.entradaEstoque(100);
        produtosEstoque.saidaEstoque(100);
        produtosEstoque.calcularValorEstoque();
        produtosEstoque.exibirResumo();

    }
}
