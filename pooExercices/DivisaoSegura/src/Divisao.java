public class Divisao {


    public double dividir(double valor1, double valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("Nao pode dividir por 0");
        }
        return valor1 / valor2;

    }
}
