package Exercicios;

public class Bonificacao {
    public static void main(String[] args) {

        double meta = 12000;
        double bonus = (meta >= 10000) ? 500.00 : 0.00;
        System.out.println("Voce ganhou o bonus + de R$ " + bonus + " Reais ");
    }
}
