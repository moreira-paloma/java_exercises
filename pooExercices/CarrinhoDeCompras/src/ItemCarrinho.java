public class ItemCarrinho {

    private String nomeProduto;
    private double precoUnitario;
    private int quantidade;


    public ItemCarrinho(String nomeProduto, int quantidade, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }


    public double getPrecoUnitario() {
        return precoUnitario;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
