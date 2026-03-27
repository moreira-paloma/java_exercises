public class FecharPedido {

    public void fecharPedido(double valorCompra, EstrategiaDeDesconto estrategia){
        double resultado = estrategia.calcular(valorCompra);
        double valorFinal = valorCompra - resultado;

        System.out.println("-------CARRINHO--------");
        System.out.println("Valor original - " + valorCompra);
        System.out.println("Valor com desconto - " + resultado);
        System.out.println("Valor final - " + valorFinal);

    }
}
