package Exercicios;

import java.util.Scanner;

public class MenuRepeticao {
    public static void main(String[] args) {

        System.out.println("Digite um número de 0 a 3 : Sendo 0 para sair. ");
        Scanner scanner = new Scanner(System.in);
        int semaforo = scanner.nextInt();
        String continuar = "S";

        while(continuar.equalsIgnoreCase("S")){

            switch(semaforo){
            case 1:
                System.out.println("Vai e tenta que uma hora voce consegue!");
                break;
            case 2:
                System.out.println("06/01/2026");
                break;
            case 3:
                System.out.println("Paloma");
                break;
            case 0:
                System.out.println("Saiu do programa.");
                continuar = "N";
                break;
            default:
                System.out.println("Numero invalido!");

         }
            if(continuar.equals("N")) {
                return;
            }
            System.out.println("Deseja continuar? S ou N");
            continuar = scanner.next().toUpperCase();
        }
        scanner.close();
    }
}
