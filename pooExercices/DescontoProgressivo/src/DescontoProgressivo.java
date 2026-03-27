public class DescontoProgressivo implements EstrategiaDeDesconto {

    @Override
    public double calcular(double valorCompra) {
        if(valorCompra > 100 && valorCompra < 300){
           double total = valorCompra * 0.05;
            System.out.println("Desconto de 5%");
           return total;

        } else if(valorCompra >= 300){
            double total = valorCompra * 0.10;
            System.out.println("Desconto de 10%");
            return total;


        } else{
            System.out.println("Nao entra descontos.");
        }
        return 0;
    }

}
