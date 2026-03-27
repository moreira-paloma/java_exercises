public class Service {

    private String description;
    private double hourlyRate;
    private int estimatedHours;

    public Service(double hourlyRate, int estimatedHours, String description) {
        this.hourlyRate = hourlyRate;
        this.estimatedHours = estimatedHours;
        this.description = description;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }
}
