package Exercicios;

import java.util.Scanner;

public class SwitchNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua nota: (A;B;C;D)");

        String entrada = scanner.nextLine().toUpperCase();
        char conceitoFinal = entrada.charAt(0);

        switch (conceitoFinal) {
            case 'A':
                System.out.println("Tirou nota A: Excelente");
                break;
            case 'B':
                System.out.println("Tirou nota B: Bom");
                break;
            case 'C':
                System.out.println("Tirou nota C: Regular");
                break;
            case 'D':
                System.out.println("Tirou nota D: Reprovado");
                break;

            default:
                System.out.println("Sem conceito de nota computada");

        }
        scanner.close();


    }
}