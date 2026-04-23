public abstract class Colaborador {

    private final int id;
    private String nome;
    private double salarioBase;

    public Colaborador(int id, String nome, double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularPagamentoFinal();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
