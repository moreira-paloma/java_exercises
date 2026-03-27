package exerciciosPoo;

public class CarroRun {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Audi A3");
        carro1.setModelo("Fusca");
        carro1.setVelocidadeAtual(250);
        carro1.acelerar();
        carro1.status();
    }
}
