public abstract class Curso {

    private final String codigo;
    private String nome;
    private double mensalidadeBase;

    public Curso(String codigo, String nome, double mensalidadeBase) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código é obrigatório.");
        }

        this.codigo = codigo;
        this.nome = nome;
        this.mensalidadeBase = mensalidadeBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getMensalidadeBase() {
        return mensalidadeBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMensalidadeBase(double mensalidadeBase) {
        this.mensalidadeBase = mensalidadeBase;
    }

    public abstract double calcularMensalidadeFinal();
}