public abstract class DigitalContent {

    private String title;
    private long numbersOfViews;

    public DigitalContent(long numbersOfViews, String title) {
        this.numbersOfViews = numbersOfViews;
        this.title = title;
    }

    public abstract double calculateRevenue();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getNumbersOfViews() {
        return numbersOfViews;
    }

    public void setNumbersOfViews(long numbersOfViews) {
        this.numbersOfViews = numbersOfViews;
    }
}
