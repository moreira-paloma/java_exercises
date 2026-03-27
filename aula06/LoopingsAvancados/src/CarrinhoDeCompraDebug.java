import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompraDebug {

    // Constantes para regras de negócio
    private static final double DESCONTO_ESPECIAL = 20.0;
    private static final int MINIMO_ITENS_PARA_DESCONTO = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> precosDosJogos = new ArrayList<>();
        boolean executando = true;

        System.out.println("=== CARRINHO DE COMPRAS SMART (CLEAN CODE) == = ");

        while (executando) {
            System.out.println("\nItens no carrinho: " +
                    precosDosJogos.size());
            System.out.println("1. Adicionar Jogo");
            System.out.println("2. Finalizar Compra");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor do jogo: ");
                double valor = scanner.nextDouble();
                precosDosJogos.add(valor);
                System.out.println("Jogo adicionado!");
            } else if (opcao == 2) {

                //Chama o método que contém a lógica de negócio
                double valorFinal = calcularTotal(precosDosJogos);

                System.out.println("=== RECIBO ===");
                System.out.println("Valor a Pagar: R$ " +
                        valorFinal);
                executando = false;
            }
        }
    }

    /**
     * Calcula o total da compra e aplica regras de desconto se
     * necessário.
     */
    private static double calcularTotal(List<Double> itens) {
        double subtotal = 0.0;

        // Soma todos os itens da lista
        for (Double preco : itens) {
            subtotal += preco;
        }

        // Verifica regra de desconto: Mais de 3 itens ganha desconto

        if (itens.size() > MINIMO_ITENS_PARA_DESCONTO) {
            System.out.println("[LOG] Aplicando desconto de fidelidade...");

            double valorComDesconto = subtotal - DESCONTO_ESPECIAL;

        //AQUI NO RETURN O ERRO, variavel de retorno errada - desconto nunca entraria.
            return valorComDesconto;
        }

        return subtotal;
    }
}