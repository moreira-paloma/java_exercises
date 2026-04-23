public class Main {
    public static void main(String[] args) {

        ChamadoTecnico chamado = new ChamadoTecnico("1","Chamado Impressora","Paloma");
        ChamadoTecnico chamado1 = new ChamadoTecnico("2","Instalar PC","Pedro");

        chamado.iniciarAtendimento("Pedro");
        chamado.exibirDetalhes();
        chamado.resolver();
        chamado.cancelar();
        chamado.exibirDetalhes();


        chamado1.cancelar();
        chamado1.iniciarAtendimento("Paloma");
        chamado1.exibirDetalhes();
    }
}
