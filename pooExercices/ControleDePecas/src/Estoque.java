import java.util.ArrayList;

public class Estoque {

    ArrayList<ProdutoLoja> listaProdutos = new ArrayList<>();

    public void venderProduto(String nomeBuscado, int quantidadeDesejada) {

        for (ProdutoLoja produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nomeBuscado)) {

                if (quantidadeDesejada > 0) {
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidadeDesejada);
                    System.out.println("Venda confirmada. ");

                } else if (quantidadeDesejada < 0) {
                    System.out.println("Quantidade insuficiente.");

                }else {
                    System.out.println("Produto nao encontrado.");
                }

            }

        }
    }
}