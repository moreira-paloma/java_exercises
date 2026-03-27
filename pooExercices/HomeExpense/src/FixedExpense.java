public class FixedExpense extends Expense {

    private double fixedValue;

    public FixedExpense(String description, double fixedValue) {
        super(description);
        this.fixedValue = fixedValue;
    }


    @Override
    public double calculateAmountToPay() {
        return fixedValue;
    }

    public double getFixedValue() {
        return fixedValue;
    }
}

