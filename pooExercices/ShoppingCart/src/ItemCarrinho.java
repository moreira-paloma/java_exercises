public class ItemCarrinho {

    private String nome;
    private double precoUnitario;
    private int quantidade;

    public ItemCarrinho(String nome, double precoUnitario, int quantidade) {

        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Digite o nome do produto. ");
        }

        if(precoUnitario <= 0){
            throw new IllegalArgumentException("O preco deve ser maior que 0. ");
        }

        if(quantidade <= 0){
            throw new IllegalArgumentException("A quantidade deve ser maior do que 0. ");
        }

        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
