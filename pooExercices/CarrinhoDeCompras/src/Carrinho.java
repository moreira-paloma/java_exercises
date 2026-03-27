import java.util.ArrayList;

public class Carrinho {

    ArrayList<ItemCarrinho> listaCompra;

    public Carrinho() {
        this.listaCompra = new ArrayList<>();
    }

    public void adicionarItem(ItemCarrinho item) {
        if (item.getQuantidade() > 0) {
            listaCompra.add(item);

        } else {
            System.out.println("Quantidade invalida");
        }
    }
    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho itemCarrinho : listaCompra) {
            total += itemCarrinho.getPrecoUnitario() * itemCarrinho.getQuantidade();

        }
        return total;
    }

    public void listarItens() {
        for (ItemCarrinho item : listaCompra) {
            System.out.println("Nome do produto " + item.getNomeProduto() + " Preco Unitario " + item.getPrecoUnitario() + " Quantidade " + item.getQuantidade());
        }


    }
}
