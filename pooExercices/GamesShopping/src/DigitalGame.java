public class DigitalGame {

    private String title;
    private double basePrice;

    public DigitalGame(String title, double basePrice) {
        this.title = title;
        this.basePrice = basePrice;

        if (basePrice < 0.0) {
            System.out.println("The price cannot be negative! Value set to 0. ");
            this.basePrice = 0.0;
        } else {
            this.basePrice = basePrice;
        }
    }

    public double applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = basePrice * (percentage / 100);
            basePrice -= discountAmount;
            return basePrice;
        } else {
            System.out.println("Invalid percentage. Must be between 1 and 100.");
            return basePrice;
        }

    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }
}