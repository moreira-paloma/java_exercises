import java.util.Scanner;
public class DebugExercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] n = new String[5];
        double[] v = new double[5];
        int x = 0;
        int op = 0;
        double t = 0;
        boolean run = true;
        String aux = "";

        System.out.println("...CARREGANDO SISTEMA CYBER 2000...");
        //for(int k=0;k<10;k++) { System.out.print("."); }
        System.out.println("\n[SISTEMA PRONTO]");

        while(run) {
            System.out.println("\n\n=== MENU PRINCIPAL ===");
            System.out.println("Items cadastrados: " + x);
            System.out.println("1. Novo Jogo");
            System.out.println("2. Ver Lista");
            System.out.println("3. Calcular Valor Total do Estoque");
            System.out.println("9. Sair");
            System.out.print("Digite: ");

            try {
                op = Integer.parseInt(sc.next());
            } catch(Exception e) {
                op = 0;
            }

            if(op == 1) {

                if(x >= 5) {
                    System.out.println("Cadastro nao realizado ");
                } else {
                    System.out.println("--- NOVO CADASTRO ---");

                    System.out.print("Nome do Jogo: ");
                    aux = sc.next();

                    System.out.print("Valor (sem R$): ");
                    try {
                        v[x] = Double.parseDouble(sc.next());
                    } catch (Exception e) {
                        v[x] = 0.0;
                        System.out.println("Valor invalido, assumindo 0.0");
                    }

                    n[x] = aux;
                    x++;
                    System.out.println("Sucesso! Jogo gravado na posicao " + (x - 1));
                }

            } else if (op == 2) {

                System.out.println("--- RELATORIO ---");
                if(x == 0) {
                    System.out.println("Nenhum dado.");
                } else {
                    for(int i=0; i < x; i++) {
                        System.out.println("["+i+"] " + n[i] + " -> R$ " + v[i]);
                    }
                }

            } else if (op == 3) {

                t = 0;
                for(int j=0; j < x; j++) {
                    t = t + v[j];
                }
                System.out.println("VALOR TOTAL EM LOJA: " + t);

            } else if (op == 9) {

                run = false;
                System.out.println("Desligando...");

            } else {

                System.out.println("Opcao Invalida!");
            }
        }
    }
}