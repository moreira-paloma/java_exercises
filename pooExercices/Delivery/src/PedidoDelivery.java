public class PedidoDelivery {

    private String nomeCliente;
    private double valorLanche;
    private double distanciaKm;

    public PedidoDelivery(String nomeCliente, double valorLanche, double distanciaKm) {
        this.nomeCliente = nomeCliente;
        this.valorLanche = valorLanche;
        this.distanciaKm = distanciaKm;
    }

    public void calcularFrete(){
        if(valorLanche < 50){
            double frete = 5.0;
            double kmRodado = 1.50;
            double totalKmPreco = frete + (kmRodado * distanciaKm);
            System.out.println("O valor do frete é de " + totalKmPreco);

        }else{
            System.out.println("Frete grátis.");
        }

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValorLanche() {
        return valorLanche;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
}
