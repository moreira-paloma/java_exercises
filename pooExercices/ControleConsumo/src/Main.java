public class Main {
    public static void main(String[] args) {

        ConsumoAgua consumoAgua = new ConsumoAgua("Imovel 15", 150);

       // consumoAgua.exibirResumo();
        consumoAgua.registrarNovaLeitura(250);
        consumoAgua.calcularConsumoPeriodo();
        consumoAgua.exibirResumo();
    }
}
