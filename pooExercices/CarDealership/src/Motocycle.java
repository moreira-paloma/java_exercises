public class Motocycle implements Financiable{

    private String model;
    private int enginecc;
    private double priceBase;

    public Motocycle(int enginecc, double priceBase, String model) {
        this.enginecc = enginecc;
        this.priceBase = priceBase;
        this.model = model;
    }

    public int getEngineCv() {
        return enginecc;
    }

    public String getModel() {
        return model;
    }

    public double getPriceBase() {
        return priceBase;
    }

    @Override
    public double[] simulateInstallments(int months, double feeMonthly) {
        double totalInterest = priceBase * (feeMonthly * months); //Calcula o juro total em dinheiro (preço base × (juros mensais × meses))
        double finalPrice = priceBase + totalInterest; //Preço final = preço original + juro total
        double installmentValue = finalPrice / months;//Valor de cada parcela = preço final dividido pela quantidade de meses

        double[] installments = new double[months];// Cria um array para armazenar todas as parcelas


        for (int i = 0; i < months; i++) { //Preenche o array com o mesmo valor de parcela para cada mês

            installments[i] = installmentValue;
        }

        return installments; //Retorna o array contendo todas as parcelas

    }

}
