public class Main {
    public static void main(String[] args) {


                Ingresso inteira = new IngressoInteira("Dune 2", 40.0);
                Ingresso meia = new IngressoMeia("Dune 2", 40.0);

                Bilheteria bilheteria = new Bilheteria();

                bilheteria.processarVenda(inteira);
                bilheteria.processarVenda(meia);
            }
        }
