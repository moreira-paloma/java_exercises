package Exercicios;

public class TernarioComConta {
    public static void main(String[] args) {

        double meta = 18000;
        double bonus = (meta >= 15000) ? meta * 0.10 : meta * 0.05;
        double salarioTotal = meta + bonus;

        System.out.println("O salario total foi de R$ " + salarioTotal + " Reais ");
    }
}
