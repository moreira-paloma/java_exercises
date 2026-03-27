public abstract class PropertyImovel {

    private String address;
    private double totalValue;

    public PropertyImovel(String address,double totalValue){
        this.address = address;
        this.totalValue = totalValue;
    }

    protected PropertyImovel() {
    }

    public double calculateFirstInstallment(int month){
        return totalValue / month;
    }

    public String getAddress() {
        return address;
    }

    public double getTotalValue() {
        return totalValue;
    }

}
