public class FretePadrao implements EstrategiaFrete {


    @Override
    public double calcular(double peso, double valorPedido) {
        double calcularFrete = peso * 5.0;
        if(calcularFrete < 5.0){
           return 5.0;
        }


        return calcularFrete;
    }

}
