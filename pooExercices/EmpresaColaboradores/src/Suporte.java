public class Suporte extends Colaborador {

    private int chamadosFechados;
    private double valorPorChamado;

    public Suporte(int id,String nome, double salarioBase, double valorPorChamado) {
        super(id,nome, salarioBase);
        this.chamadosFechados = 0;
        this.valorPorChamado = valorPorChamado;
    }

    @Override
    public double calcularPagamentoFinal() {
        return getSalarioBase() + (chamadosFechados * valorPorChamado);
    }
}
