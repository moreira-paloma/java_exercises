import java.util.Scanner;

public class ValidacaoSenha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String senha = "java123";
        String senhaDigitada;

        do {
            System.out.println("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            if(!senhaDigitada.equals(senha)){
                System.out.println("Senha incorreta! Tente novamente!");
            }

        } while(!senhaDigitada.equals(senha));
        System.out.println("Voce acertou a senha! ");
        }
    }
