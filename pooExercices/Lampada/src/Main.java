public class Main {
    public static void main(String[] args) {


        Lampada lampada = new Lampada();

        lampada.status();
        lampada.ligar();
        lampada.status();
        lampada.ajustarIntensidade(50);
        lampada.status();
        lampada.desligar();
        lampada.status();
    }
}
