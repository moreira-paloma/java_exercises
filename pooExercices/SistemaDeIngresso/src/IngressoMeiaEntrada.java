public class IngressoMeiaEntrada extends Ingresso{


    public IngressoMeiaEntrada(String evento, double precoBase) {
        super(evento, precoBase);
    }

    @Override
    public double calcularPrecoFinal(){
        return getPrecoBase() / 2;
    }

}
