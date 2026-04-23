import java.util.ArrayList;

public class Pedido {

    private final String numero;
    private String cliente;
    private boolean cancelado;
    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public Pedido(String numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void adicionarItem(ItemPedido item) {

        if (cancelado) {
            System.out.println("Pedido cancelado. Não é possível adicionar itens.");
            return;
        }

        itens.add(item);
    }

    public void cancelarPedido() {
        cancelado = true;
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void listarItens() {
        for (ItemPedido item : itens) {
            System.out.println(item.getProduto() + " | " +
                    item.getQuantidade() + " x " + item.getPrecoUnitario() +
                    " = " + item.calcularSubtotal());
        }
    }

    public void exibirResumo() {
        System.out.println("\n--- Pedido " + numero + " ---");
        System.out.println("Cliente: " + cliente);
        System.out.println("Cancelado: " + cancelado);
        System.out.println("Total: " + calcularTotal());
    }
}