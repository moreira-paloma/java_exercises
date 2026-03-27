public class FreteExpresso implements EstrategiaFrete {


    @Override
    public double calcular(double peso, double valorPedido) {
        return peso * 10.0;
    }
}
