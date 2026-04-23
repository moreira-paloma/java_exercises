public class CursoPromocional extends Curso {

    private double percentualDesconto;

    public CursoPromocional(String codigo, String nome, double mensalidadeBase, double percentualDesconto) {
        super(codigo, nome, mensalidadeBase);
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularMensalidadeFinal() {
        return getMensalidadeBase() - (getMensalidadeBase() * percentualDesconto);
    }
}