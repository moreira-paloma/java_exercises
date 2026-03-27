package Exercicios;

import java.util.Scanner;

public class IfTernario2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantidadeEstoque = 5;

        System.out.println("Digite uma número de 0 a 10: ");
        quantidadeEstoque = scanner.nextInt();
        String status =(quantidadeEstoque > 0) ? "Disponivel!" : "Indisponivel"; //if ternario

        System.out.println(status);


    }
}
