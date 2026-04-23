public class Main {
    public static void main(String[] args) {

        AssinaturaDigital assinatura1 = new AssinaturaDigital("Paloma", "Premium", 25);
        AssinaturaDigital assinatura2 = new AssinaturaDigital("Pedro", "Gold", 35);

        System.out.println("Resumos iniciais");
        assinatura1.exibirResumo();
        assinatura2.exibirResumo();

        System.out.println(" Atualizando taxa base para 30.0 ");
        AssinaturaDigital.atualizarTaxaMensal(30.0);

        System.out.println("Resumos após atualização");
        assinatura1.exibirResumo();
        assinatura2.exibirResumo();

        System.out.println("Cancelando assinatura 1");
        assinatura1.cancelar();

        System.out.println("Cancelar de novo");
        assinatura1.cancelar();

        System.out.println("Reativando assinatura 1");
        assinatura1.reativar();

        System.out.println("Resumo final");
        assinatura1.exibirResumo();
    }
}