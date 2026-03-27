public class Main {
    public static void main(String[] args) {

        SalaReuniao salaReuniao = new SalaReuniao("1");

        salaReuniao.exibirSituacao();
        salaReuniao.reservar("Paloma");
        salaReuniao.cancelarReserva();
        salaReuniao.exibirSituacao();

    }

}
