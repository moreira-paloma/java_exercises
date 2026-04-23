import java.util.ArrayList;

public class CarrinhoCompra {

    ArrayList<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(ItemCarrinho item) {
        itens.add(item);

    }

    public double calcularTotal() {
        double soma = 0;
        for (ItemCarrinho item : itens) {
            soma += item.getPrecoUnitario() * item.getQuantidade();
        }
        return soma;
    }

    public void buscarItemMaiorPrecoUnitario() {

        if(itens.isEmpty()){
            System.out.println("A lista esta vazia.");
            return;
        }
        ItemCarrinho maiorItem = itens.get(0);
        for (ItemCarrinho item : itens) {
            if (item.getPrecoUnitario() > maiorItem.getPrecoUnitario()) {
                maiorItem = item;

            }
        }
        System.out.println("Maior item: " + maiorItem.getNome() + "No valor de R$ " + maiorItem.getPrecoUnitario());
    }

    public void listarItens(){
        if(itens.isEmpty()){
            System.out.println("Carrinho vazio.");
            return;
        }
        for(ItemCarrinho item : itens){
            System.out.println("Lista de Produtos " + item.getNome() + "\n" +
                    "Preco unitário " + item.getPrecoUnitario() +
                   "\n" + "Quantidade " + item.getQuantidade()
            );
        }
    }

    public void exibirResumo(){
        System.out.println("Quantidade de itens: " + itens.size());
        System.out.println("Total do carrinho: " + calcularTotal());
        System.out.println("Item mais caro: " );
        buscarItemMaiorPrecoUnitario();
    }
}

