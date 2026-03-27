public class Main {
    public static void main(String[] args) {

        Fatura fatura = new Fatura("Cartao NUBank",1000);

        fatura.pagar(900);
        fatura.pagar(50);
        fatura.estaQuitada();
        fatura.exbirResumo();


    }
}
