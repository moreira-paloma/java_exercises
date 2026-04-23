public abstract class Funcionario {

    private static int geradorMatricula = 1;
    private int matricula;
    private String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.matricula = geradorMatricula ++;
    }

    public abstract double calcularSalarioFinal();

    public String obterResumo() {
        return "Matrícula: " + matricula + " | Nome: " + nome +
                " | Salário Base: R$ " + String.format("%.2f", salarioBase);
    }

    public String getNome() {
        return nome;
    }
}

