import java.util.Scanner;

public class WhileSoma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double total = 0 ;
        double numDigitado;

        do{
            System.out.println("Digite alguns números que irei soma-los, quando digitar 0 o programa se encerrará : ");
            numDigitado = scanner.nextDouble();
            total += numDigitado;

        }
        while(numDigitado != 0);

        System.out.println("A soma dos números digitados é de : " + total);

    }

}
