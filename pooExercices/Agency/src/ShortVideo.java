public class ShortVideo extends DigitalContent{

    public ShortVideo(long numbersOfViews, String title) {
        super(numbersOfViews, title);
    }

    @Override
    public double calculateRevenue() {
        return (getNumbersOfViews() / 1000.0) * 0.15;
    }
}