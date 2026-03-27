public class Main {
    public static void main(String[] args) {

        PedidoAprovacao pedidoAprovacao = new PedidoAprovacao("10" , 100);

        pedidoAprovacao.enviarAnalise();
        pedidoAprovacao.mostrarStatusAtual();
        pedidoAprovacao.aprovar();
        pedidoAprovacao.mostrarStatusAtual();
    }
}
