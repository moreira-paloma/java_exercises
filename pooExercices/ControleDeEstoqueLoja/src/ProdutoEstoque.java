public class ProdutoEstoque {

    private String nome;
    private int quantidade;
    private int estoqueMinimo;

    public ProdutoEstoque(String nome, int quantidade, int estoqueMinimo) {
        this.nome = nome;

        if(quantidade >= 0 && estoqueMinimo >= 0 ){
            this.quantidade = quantidade;
            this.estoqueMinimo = estoqueMinimo;

        } else{
            System.out.println("Quantidade menor que 0");
        }
    }

    public void adicionarEstoque(int quantidadeEntrada){
        if(quantidadeEntrada > 0){
            this.quantidade += quantidadeEntrada;

        }else{
            System.out.println("Quantidade invalida.");
        }
    }

    public void retirarEstoque(int quantidadeSaida){
        if(quantidadeSaida > 0){
            this.quantidade -= quantidadeSaida;
        }
    }

    public boolean estaAbaixoMinimo(){
        return this.quantidade < this.estoqueMinimo;

    }

    public void exibirRelatorio() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Quantidade atual: " + this.quantidade);
        System.out.println("Esta abaixo do minimo: " + (estaAbaixoMinimo() ? "Sim" : "Não"));
    }
}
