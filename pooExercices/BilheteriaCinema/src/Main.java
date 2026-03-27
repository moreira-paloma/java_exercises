public class Main {

    public static void main(String[] args) {

        AssentoCinema assento = new AssentoCinema("0101");

        assento.exibirStatus();
        assento.reservar("Maria");
        assento.exibirStatus();
        assento.cancelarReserva();
        assento.exibirStatus();
        assento.cancelarReserva();
    }
}
