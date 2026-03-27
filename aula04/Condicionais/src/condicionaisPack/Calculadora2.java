package condicionaisPack;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora2 {
        public static void main(String[] args) {
            // 1. Declaração das variáveis no topo
            Scanner leitor = new Scanner(System.in);
            leitor.useLocale(Locale.US); // Força o uso do ponto (.) em vez da vírgula

            double num1 = 0;
            double num2 = 0;
            double resultado = 0;
            char operacao = ' ';

            System.out.println("--- Calculadora  ---");

            // 2. Validação do primeiro número
            System.out.print("Digite o primeiro número: ");
            if (leitor.hasNextDouble()) {
                num1 = leitor.nextDouble();
                // 3. Validação da operação

                System.out.print("Digite a operação (+, -, *, /): ");
                operacao = leitor.next().charAt(0);

                if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/') {

                    // 4. Validação do segundo número
                    System.out.print("Digite o segundo número: ");
                    if (leitor.hasNextDouble()) {
                        num2 = leitor.nextDouble();

                        // 5. Lógica de cálculo
                        if (operacao == '+') {
                            resultado = num1 + num2;
                            System.out.println("Resultado: " + resultado);
                        }
                        else if (operacao == '-') {
                            resultado = num1 - num2;
                            System.out.println("Resultado: " + resultado);
                        }
                        else if (operacao == '*') {
                            resultado = num1 * num2;
                            System.out.println("Resultado: " + resultado);
                        }
                        else if (operacao == '/') {
                            if (num2 != 0) {
                                resultado = num1 / num2;
                                System.out.println("Resultado: " + resultado);
                            } else {
                                System.out.println("Erro: Divisão por zero não permitida.");
                            }
                        }
                    } else {
                        System.out.println("Erro: Você digitou letras ou símbolos no lugar do segundo número.");
                    }
                } else {
                    System.out.println("Erro: Operação inválida! Use apenas +, -, * ou /.");
                }
            } else {
                System.out.println("Erro: Você digitou letras ou símbolos no lugar do primeiro número.");
            }

            leitor.close();
        }
    }
