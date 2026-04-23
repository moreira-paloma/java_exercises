public class CursoPremium extends Curso {

    private double valorMaterialExtra;

    public CursoPremium(String codigo, String nome, double mensalidadeBase, double valorMaterialExtra) {
        super(codigo, nome, mensalidadeBase);
        this.valorMaterialExtra = valorMaterialExtra;
    }

    @Override
    public double calcularMensalidadeFinal() {
        return getMensalidadeBase() + valorMaterialExtra;
    }
}