public class LongVideo extends DigitalContent {

    private long minutesWatched;

    public LongVideo(long numbersOfViews, String title, long minutesWatched) {
        super(numbersOfViews, title);
        this.minutesWatched = minutesWatched;
    }

    @Override
    public double calculateRevenue() {
        return (getNumbersOfViews() / 1000.0) * 2.50 + (minutesWatched * 0.05);
    }
}