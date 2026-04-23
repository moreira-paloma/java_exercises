public class AssinaturaDigital {

    private String titular;
    private String nomePlano;
    private double percentualAdicional;
    private boolean ativa;
    private static double taxaBaseMensal = 20.0;

    public AssinaturaDigital(String titular, String nomePlano, double percentualAdicional) {
        if(titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Digite o titular corretamente.");
        }
        this.titular = titular;

        if(nomePlano == null || nomePlano.isBlank()){
            throw new IllegalArgumentException("Digite o nome do plano corretamente.");
        }
        this.nomePlano = nomePlano;

        if(percentualAdicional < 0){
            throw new IllegalArgumentException("O percentual nao pode ser negativo");
        }
        this.percentualAdicional = percentualAdicional;

        this.ativa = true;

    }

    public double calcularMensalidade(){
        return taxaBaseMensal + percentualAdicional;
    }

    public void cancelar(){
        if(!ativa){
            System.out.println("Assinatura ja esta cancelada.");
            return;
        }
        ativa = false;
        System.out.println("Assinatura cancelada.");

    }
    public void reativar(){
        if(ativa){
            System.out.println("A assinatura já esta ativa.");
            return;
        }
        this.ativa = true;
        System.out.println("Assinatura reativada.");
    }

    public static void atualizarTaxaMensal(double novoValor){
        if(novoValor < 0){
            throw new IllegalArgumentException("A taxa base tem que ser maior que 0");
        }
        taxaBaseMensal = novoValor;
    }

    public void exibirResumo(){
        System.out.println("Titular " + titular);
        System.out.println("Plano " + nomePlano);
        System.out.println("Situacao " + ativa);
        System.out.println("Valor da mensalidade atual " + calcularMensalidade() );
    }
}
