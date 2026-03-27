package Exercicios;

public class CarrinhoCompras {

    public static void main(String[] args) {

        double[] precos = {19.90, 55.0, 120.0, 9.50};
        double soma =0;

        for(double preco : precos){
            soma += preco;
            System.out.println("O valor do seu carrinho é de : " + soma);

        }
    }
}
