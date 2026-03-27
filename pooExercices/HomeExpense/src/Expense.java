public abstract class Expense {

    protected String description;

    public Expense(String description) {
        this.description = description;
    }

    protected Expense() {
    }

    public String getDescription() {
        return description;
    }

    public abstract double calculateAmountToPay();

}