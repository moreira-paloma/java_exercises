public class BikeParts {

    private String name;
    private int serviceLifeKm;  // vida útil da peça
    private int mileageUsedKm; // km já rodados


    public BikeParts(String name, int serviceLifeKm){
        this.name = name;
        this.serviceLifeKm = serviceLifeKm;
        this.mileageUsedKm = 0; // peca comeca nova
    }

    public void addWear(int km){
        this.mileageUsedKm += km;  // soma desgaste corretamente


    }

    public String getName() {
        return name;
    }

    public int getServiceLifeKm() {
        return serviceLifeKm;
    }

    public int getMileageUsedKm() {
        return mileageUsedKm;
    }
}