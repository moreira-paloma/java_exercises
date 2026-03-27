public class ConsumoAgua {

    private String identificacaoImovel;
    private double leituraAnterior;
    private double leituraAtual;

    public ConsumoAgua(String identificacaoImovel, double leituraAnterior) {
        this.identificacaoImovel = identificacaoImovel;
        this.leituraAnterior = leituraAnterior;
        this.leituraAtual = leituraAnterior;
    }

    public void registrarNovaLeitura(double novaLeitura){
        if(novaLeitura < this.leituraAtual){
            System.out.println("A nova leitura é menor do que a leitura atual.");
            return;
        }
        this.leituraAnterior = this.leituraAtual;
        this.leituraAtual = novaLeitura;
    }

    public double calcularConsumoPeriodo(){
        double consumo = leituraAtual - leituraAnterior;
        return consumo;
    }

    public void exibirResumo(){
        System.out.println("Imovel ID " + identificacaoImovel);
        System.out.println("Consumo anterior da residencia: " + leituraAnterior);
        System.out.println("Leitura atual do imóvel: " + leituraAtual);
        System.out.println("Consumo total: " + calcularConsumoPeriodo());
    }
}
