public class ResumoEntrega {

    private double peso;
    private double valor;
    private EstrategiaFrete estrategia;

    public ResumoEntrega(double peso, double valor, EstrategiaFrete estrategia) {
        this.peso = peso;
        this.valor = valor;
        this.estrategia = estrategia;
    }

    public double calcularFrete() {
        if (valor <= 0 || peso <= 0) {
            throw new IllegalArgumentException("Peso e valor devem ser maiores que zero.");
        }

        double frete = estrategia.calcular(peso, valor);
        return frete;
    }

    public void mostrarResumo() {
        double frete = calcularFrete();
        double total = valor + frete;

        System.out.println("Peso: " + peso);
        System.out.println("Valor do pedido: " + valor);
        System.out.println("Frete: " + frete);
        System.out.println("Total: " + total);
    }
}