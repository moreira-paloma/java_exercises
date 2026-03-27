import java.util.Scanner;

public class Highscore_Spaghetti {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] score = new int[5];
        int contador = 0;
        boolean f = true;

        // Preenchendo fake para teste
        nomes[0] = "AAA";
        score[0] = 1000;
        nomes[1] = "BBB";
        score[1] = 800;

        System.out.println("--- HIGHSCORE SYSTEM v0.1 ---");

        while (f) {
            System.out.println("\n1. Verificar novo Recorde | 9. Sair");
            System.out.print("Opcao: ");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.print("Digite seu Nome: ");
                String n = sc.next();
                System.out.print("Score: ");
                int p = sc.nextInt();

                // LOOP DE VERIFICAÇÃO
                for (int i = 0; i < nomes.length; i++) {

                    // 🔧 **CORREÇÃO DO BUG**
                    // Antes: nomes[i].equals(n) → dava NullPointerException
                    // Agora: só compara se nomes[i] NÃO for null
                    if (nomes[i] != null && nomes[i].equals(n)) {
                        System.out.println("Usuario ja existe! Atualizando...");
                        score[i] = p;
                        contador = 1;
                    }
                }

                if (contador == 0) {
                    System.out.println("Novo jogador registrado (Simulacao)!");
                }

                contador = 0; // Reseta flag

            } else if (op == 9) {
                f = false;
                System.out.println("Encerrando...");
            }
        }
    }
}