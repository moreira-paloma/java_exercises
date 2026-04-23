public class Main {

    public static void main(String[] args) {

            Ingresso ingresso1 = new Ingresso("Show Adele", 100);
            Ingresso ingresso2 = new IngressoVip("Show Adele", 100, 100);
            Ingresso ingresso3 = new IngressoMeiaEntrada("Show Adele", 100);

            Ingresso[] ingressos = {ingresso1, ingresso2, ingresso3}; //perguntar ao Mateus

            for (Ingresso ing : ingressos) {
                ing.exibirResumo();
                System.out.println("-------------------------");
            }
        }
    }
