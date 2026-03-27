import java.util.Scanner;

public class NumSecreto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numSecreto =6;
        int numTry;

        do{
            System.out.println("Tente adivinhar um número de 0 a 10: ");
            numTry = scanner.nextInt();
            if(numTry != numSecreto){
                System.out.println("Tente novamente!");
            }
        }
        while(numTry != numSecreto);
        System.out.println("Voce acertou!");
        }
    }
