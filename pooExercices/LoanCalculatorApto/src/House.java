public class House extends PropertyImovel {

    public House(String address, double totalValue) {
        super(address, totalValue);

    }

    @Override
    public double calculateFirstInstallment(int mounth) {
        double baseInstallment = getTotalValue() / mounth;
        return baseInstallment + 150;
    }
}
