public class Gerente extends Funcionario {

    private String departamento;
    private double bonusFixo;

    public Gerente(String nome, double salarioBase, String departamento, double bonusFixo) {
        super(nome, salarioBase);
        this.departamento = departamento;
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + bonusFixo;
    }

    @Override
    public String obterResumo() {
        return super.obterResumo() + " | Cargo: Gerente de " + departamento +
                " | Salário Final: R$ " + String.format("%.2f", calcularSalarioFinal());
    }
}
