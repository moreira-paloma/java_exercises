import java.util.Scanner;

public class OperadoresTestes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        String numero = scanner.nextLine();

        int numPar = Integer.parseInt(numero);

        if (numPar % 2 == 0 ) {
            System.out.println("Esse número é par! ");
        }
        else{
            System.out.println("Esse número é impar!");
        }

        if (numPar % 5 ==0){
            System.out.println("Esse número é multiplo de 5.");

        }else{
            System.out.println("O número nao é multiplo.");
        }

        }

    }
