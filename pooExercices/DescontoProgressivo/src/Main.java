public class Main {
    public static void main(String[] args) {


        DescontoComum descontoComum = new DescontoComum();
        DescontoPremium descontoPremium = new DescontoPremium();
        DescontoProgressivo descontoProgressivo = new DescontoProgressivo();
        FecharPedido fecharPedido = new FecharPedido();

        fecharPedido.fecharPedido(150, descontoPremium);
        fecharPedido.fecharPedido(150, descontoComum);
        fecharPedido.fecharPedido(150, descontoProgressivo);

    }
}
