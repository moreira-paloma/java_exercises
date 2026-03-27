public class Main {
    public static void main(String[] args) {


        Carrinho carrinho = new Carrinho();
        ItemCarrinho item = new ItemCarrinho("Mouse", 10, 350);
        ItemCarrinho item2 = new ItemCarrinho("Teclado", 10,200);
        ItemCarrinho item3 = new ItemCarrinho("Cadeira Gamer", 5, 500);

        carrinho.adicionarItem(item);
        carrinho.adicionarItem(item2);
        carrinho.adicionarItem(item3);
        carrinho.listarItens();
        System.out.println("Valor total do carrinho " + carrinho.calcularTotal());

    }
}
