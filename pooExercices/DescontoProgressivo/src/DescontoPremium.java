public class DescontoPremium implements EstrategiaDeDesconto{

    @Override
    public double calcular(double valorCompra) {
        return valorCompra * 0.10;
    }
}
