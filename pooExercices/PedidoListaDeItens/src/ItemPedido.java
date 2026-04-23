public class ItemPedido {

    private String produto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String produto, int quantidade, double precoUnitario) {

        if (produto == null || produto.isBlank()) {
            throw new IllegalArgumentException("Produto inválido.");
        }

        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }

        if (precoUnitario <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }

        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }
}