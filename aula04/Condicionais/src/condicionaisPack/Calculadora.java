package condicionaisPack;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");

        System.out.println("Digite o primeiro número: ");
        String n1 = scanner.nextLine();

        while (!ehNumeroValido(n1)) {
            System.out.println("Valor inválido. Digite novamente:");
            n1 = scanner.nextLine();
        }
        double converter1 = Double.parseDouble(n1.replace("," , "."));


        System.out.println("Digite o segundo número: ");
        String n2 = scanner.nextLine();

        while (!ehNumeroValido(n2)) {
            System.out.println("Valor inválido. Digite novamente:");
            n2 = scanner.nextLine();
        }
        double converter2 = Double.parseDouble(n2.replace(",","."));


        System.out.println("Digite a operacao: ( +,-,*,/ )");
        char operation = scanner.next().charAt(0);

        while(operation != '+' && operation != '-' && operation != '*' && operation !='/'){
            System.out.println(" Operacao invalida! Somente digite ( +, - , *, /) ");
            operation = scanner.next().charAt(0);
        }

        double result;

        if (operation == '+') {
            result = converter1 + converter2;
            System.out.println("O resultado da soma é: " + result);

        } else if (operation == '-') {
            result = converter1 - converter2;
            System.out.println("O resultado da subtracao é: " + result);

        } else if (operation == '*') {
            result = converter1 * converter2;
            System.out.println("O resultado da multiplicacao é: " + result);

        } else if (operation == '/') {

            if (converter2 == 0) {
                System.out.println("Não é possível dividir por zero.");
                return;
            }

            result = converter1 / converter2;
            System.out.println("O resultado da divisao é: " + result);

        } else {
            System.out.println("Operacao invalida.");
        }

        scanner.close();
    }


    static boolean ehNumeroValido(String texto) {
        try {
            texto = texto.replace("," , ".");
            Double.parseDouble(texto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}