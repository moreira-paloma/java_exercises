public class VariableExpense extends Expense{

    private double pricePerUnit;
    private double consumedQuantity;

    public VariableExpense(String description, double pricePerUnit, double consumedQuantity) {
        super(description);
        this.pricePerUnit = pricePerUnit;
        this.consumedQuantity = consumedQuantity;
    }


    @Override
    public double calculateAmountToPay() {
        return pricePerUnit * consumedQuantity;

    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getConsumedQuantity() {
        return consumedQuantity;
    }
}
