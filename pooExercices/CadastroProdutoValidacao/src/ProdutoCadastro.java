public class ProdutoCadastro {

    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoCadastro(String nome, double preco, int quantidade) {
        if(nome ==null || nome.isBlank()){
            throw new IllegalArgumentException("Digite o seu nome.");
        }
        this.nome = nome;

        if(preco <= 0){
            throw new IllegalArgumentException("O preco nao pode ser negativo.");
        }
        this.preco = preco;

        if(quantidade < 0){
            throw new IllegalArgumentException("Quantidade nao pode ser negativa.");
        }
        this.quantidade = quantidade;
    }

    public void exibirResumo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preco do produto: " + preco);
        System.out.println("Quantidade do produto " + quantidade);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
