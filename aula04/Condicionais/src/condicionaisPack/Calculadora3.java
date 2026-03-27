package condicionaisPack;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double num1 = 0;
        double num2 = 0;
        double result;
        char op;

        System.out.println("-- Calculadora --");

        System.out.println("Digite o primeiro número: ");

        if(scanner.hasNextDouble()){
            num1 = scanner.nextDouble();

        } else{
            System.out.println("Número invalido.");
            return;
        }

        System.out.println("Digite a operacao: ( +, -, *, / ): ");
        op = scanner.next().charAt(0);

        if(op !='+' && op !='-' && op !='*' && op !='/'){
            System.out.println("Operacao invalida!");
            return;
        }


        System.out.println("Digite o segundo número: ");

        if(scanner.hasNextDouble()){
            num2 = scanner.nextDouble();

        } else {
            System.out.println("Número invalido.");
            return;
        }

        if(op == '+'){
            result = num1 + num2;
            System.out.println("O resultado da soma é de : " + result);

        } else if (op == '-'){
            result = num1 - num2;
            System.out.println("O resultado da subtracao é de : " + result);

        } else if (op == '*'){
            result = num1 * num2;
            System.out.println("O resultado da multiplicacao é de : " + result);

        } else if (op == '/'){
            if(num2 == 0){
                System.out.println("Nao pode ser dividido por zero ");
                return;
            }
            result = num1 / num2;
            System.out.println("O resultado da divisao é de : " + result);
        }

        }
    }

