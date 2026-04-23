public class CarrinhoCompra {

    private double total;

    public CarrinhoCompra(double total) {
        if(total <= 0){
            throw new IllegalArgumentException(" O total nao pode ser 0 ou negativo.");
        }
        this.total = total;
    }

    public double aplicarDesconto(double desconto){
        if(desconto <= 0){
            throw new IllegalArgumentException(" O desconto nao pode ser 0 ou negativo.");
        }
        if(desconto >= total){
            throw new IllegalArgumentException("O desconto nao pode ser maior ou igual ao total. ");
        }
        return total - desconto;
    }

    public double getTotal() {
        return total;
    }
}
