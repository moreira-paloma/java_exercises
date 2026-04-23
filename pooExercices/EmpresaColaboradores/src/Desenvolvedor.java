public class Desenvolvedor extends Colaborador {

    private double bonusPorProjeto;


    public Desenvolvedor(int id,String nome, double salarioBase, double bonusPorProjeto) {
        super(id,nome, salarioBase);
        this.bonusPorProjeto = bonusPorProjeto;
    }

    @Override
    public double calcularPagamentoFinal() {
        return getSalarioBase() + bonusPorProjeto;
    }


}
