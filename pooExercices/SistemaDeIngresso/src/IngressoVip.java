public class IngressoVip extends Ingresso {

    double adicionalVip;

    public IngressoVip(String evento, double precoBase, double adicionalVip) {
        super(evento, precoBase);

        if (adicionalVip < 0) {
            throw new IllegalArgumentException("Negativo");
        }
        this.adicionalVip = adicionalVip;

    }
    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + adicionalVip;
    }

}
