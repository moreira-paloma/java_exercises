public class MotoService {

    private String descriptions;
    private double value;

    public MotoService(String descriptions, double value){
        this.descriptions = descriptions;
        this.value = value;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public double getValue() {
        return value;
    }
}
