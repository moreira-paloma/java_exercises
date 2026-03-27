package Exercicios;

import java.util.Scanner;

public class SwitchSemaforo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {

            System.out.println("Semaforo digital : Digite 1,2,3");
            int semaforo = scanner.nextInt();

            switch (semaforo) {
                case 1:
                    System.out.println("Semaforo vermelho - PARE!");
                    break;
                case 2:
                    System.out.println("Semaforo amarelo - Tenha atencao");
                    break;
                case 3:
                    System.out.println("Semaforo verde - Continue!");
                    break;
                default:
                    System.out.println("Erro no sinal");
            }
            System.out.println("Deseja continuar? S ou N");
            continuar = scanner.next().toUpperCase();


        }
        scanner.close();
    }
}