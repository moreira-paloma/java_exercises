public class ProdutosEstoque {

    private String codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;


    public ProdutosEstoque(String codigo, String nome, double preco, int quantidadeEstoque) {

        if(codigo == null){
            throw new IllegalArgumentException("Digite o codigo. ");
        }
        this.codigo = codigo;

        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Digite o seu nome. ");
        }
        this.nome = nome;

        if(preco <= 0){
            throw new IllegalArgumentException("O preco precisa ser maior que 0. ");
        }
        this.preco = preco;

        if(quantidadeEstoque < 0){
            throw new IllegalArgumentException("A quantidade nao pode ser negativa. ");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void entradaEstoque(int quantidade){
        if(quantidade < 0){
            throw new IllegalArgumentException("Quantidade deve ser positiva. ");
        }
        this.quantidadeEstoque += quantidade;
    }

    public void saidaEstoque(int quantidade){
        if(quantidade > 0 && quantidadeEstoque > 0){
            this.quantidadeEstoque -= quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade e estoque estao negativos.");
        }
    }

    public double calcularValorEstoque(){

        return this.preco * this.quantidadeEstoque;
    }

    public void exibirResumo(){
        System.out.println("Codigo do produto: " + codigo);
        System.out.println("Nome produto: " + nome);
        System.out.println("Preco produto: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        double total = calcularValorEstoque();
        System.out.println("Valor total do estoque: " + calcularValorEstoque());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
