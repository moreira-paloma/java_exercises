public class Main {
    public static void main(String[] args) {

        try {
            CarrinhoCompra carrinho = new CarrinhoCompra(500);
            double descontoAplicado = carrinho.aplicarDesconto(100);
            System.out.println(descontoAplicado);

        } catch (Exception e){
            System.out.println("Erro -- " + e.getMessage());
        }

        try {
            CarrinhoCompra carrinho1 = new CarrinhoCompra(500);
            double descontoAplicado = carrinho1.aplicarDesconto(500);
            System.out.println(descontoAplicado);

        } catch (Exception e){
            System.out.println("Erro -- " + e.getMessage());
        }
    }
}
