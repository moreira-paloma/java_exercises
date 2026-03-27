public class Video {

    private String title;
    private int durationSeconds;

    public Video(String title, int durationSeconds){
        this.title = title;
        this.durationSeconds = durationSeconds;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
}
