import java.util.Scanner;

public class Adivinhar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numSecreto = 7;
        int numCorreto;

        do{
            System.out.println("Digite um número de 0 a 10: ");
            numCorreto = scanner.nextInt();
            if(numCorreto != numSecreto){
                System.out.println("Número errado! Tente novamente.");
            }
        }
        while(numCorreto != numSecreto);
            System.out.println("Voce acertou! Parabens!");
        }
    }

