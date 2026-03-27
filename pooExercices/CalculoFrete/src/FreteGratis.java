public class FreteGratis implements EstrategiaFrete {

    @Override
    public double calcular(double peso, double valorPedido) {
        System.out.println("Frete grátis.");
       return 0;
    }
}
