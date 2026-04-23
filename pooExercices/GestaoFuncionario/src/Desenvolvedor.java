public class Desenvolvedor extends Funcionario{

    private String linguagem;
    private String nivel;

    public Desenvolvedor(String nome, double salarioBase, String linguagem, String nivel) {
        super(nome, salarioBase);
        this.linguagem = linguagem;
        this.nivel = nivel;
    }

    @Override
    public double calcularSalarioFinal() {
        double adicional = 0;
        if(nivel.equalsIgnoreCase("Pleno")){
            adicional = 1500;
        } else if(nivel.equalsIgnoreCase("Senior")){
            adicional = 3000;
        }
        return salarioBase + adicional;
    }

    @Override
    public String obterResumo() {
        return super.obterResumo() + " | Cargo: Dev " + nivel + " (" + linguagem + ")" +
                " | Salário Final: R$ " + String.format("%.2f", calcularSalarioFinal());
    }
}
