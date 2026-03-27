public class ProdutoLoja {

    private String nome;
    private int quantidadeEstoque;

    public ProdutoLoja(String nome, int quantidadeEstoque){
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;

    }


    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
