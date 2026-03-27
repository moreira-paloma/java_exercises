package semPoo;

public class SistemaEstoqueSemPoo {
    public static void main(String[] args) {

        String nome1 = "Teclado mecanico";
        double preco1 = 150;
        int qtd1 = 10;

        String nome2 = "Mouse gamer";
        double preco2 = 90;
        int qtd2 = 5;

        String nome3 = "Monitor";
        double preco3 = 900;
        int qtd3 = 2;

        double total1 = preco1 * qtd1;
        double total2 = preco2 * qtd2;
        double total3 = preco3 * qtd3;

        System.out.println("Relatorio sem POO: ");

        System.out.println("Produto: " + nome1 + " | Total em Estoque: R$ " + total1);
        System.out.println("Produto: " + nome2 + " | Total em Estoque: R$ " + total2);
        System.out.println("Produto: " + nome3 + " | Total em Estoque: R$ " + total3);

    }
}
