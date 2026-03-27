public class Apartment extends PropertyImovel{

    private double condoFee;

    public Apartment(String address, double totalValue, double condoFee) {
        super(address, totalValue);
        this.condoFee = condoFee;

    }

    @Override
    public double calculateFirstInstallment(int month){
        double baseInstallment = getTotalValue() / month;
        return baseInstallment + condoFee;  //condominio

    }

}
