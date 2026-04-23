public class Main {
    public static void main(String[] args) {

        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();
        CarrinhoCompra carrinhoCompra1 = new CarrinhoCompra();
        ItemCarrinho itemCarrinho = new ItemCarrinho("Bola Futebol", 150, 10);
        ItemCarrinho itemCarrinho1 = new ItemCarrinho("Bola Handball", 200, 10);

        System.out.println("_______________________");

        carrinhoCompra1.exibirResumo();
        carrinhoCompra1.adicionarItem(itemCarrinho1);
        carrinhoCompra1.listarItens();
        carrinhoCompra1.calcularTotal();
        carrinhoCompra1.buscarItemMaiorPrecoUnitario();

        System.out.println("_______________________");

        carrinhoCompra.adicionarItem(itemCarrinho);
        carrinhoCompra.listarItens();
        carrinhoCompra.calcularTotal();
        carrinhoCompra.buscarItemMaiorPrecoUnitario();

    }
}
