import java.util.ArrayList;

public class Motocycle {

    private String model;
    private ArrayList<BikeParts> parts;

    public Motocycle(String model) {
        this.model = model;
        this.parts = new ArrayList<>();
    }

    public void addParts(BikeParts part){
        parts.add(part);
    }

    public void registerTravel(int kmTravel){
        for(BikeParts part : parts){
            part.addWear(kmTravel);

        }
    }

    public void partsForReplace() {
        System.out.println("Checking parts for: " + model + " ");

        boolean anyPartToReplace = false;
        for (BikeParts part : parts) {
            if (part.getMileageUsedKm() >= part.getServiceLifeKm()) {
                System.out.println(" - " + part.getName() + " needs replacement.");
                anyPartToReplace = true;
            }
        }

        if (!anyPartToReplace) {
            System.out.println("All parts are in good condition.");
        }

        System.out.println();
    }

}
