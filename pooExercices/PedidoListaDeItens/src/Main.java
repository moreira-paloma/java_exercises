public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido("001", "Paloma");

        ItemPedido item1 = new ItemPedido("Mouse", 2, 50);
        ItemPedido item2 = new ItemPedido("Teclado", 1, 120);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        pedido.listarItens();
        pedido.exibirResumo();

        pedido.cancelarPedido();

        pedido.adicionarItem(new ItemPedido("Monitor", 1, 800));
    }
}