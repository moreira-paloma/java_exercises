import java.util.ArrayList;
import java.util.List;

public class ServiceOrder {

    private String licencePlate;
    private ArrayList<MotoService> services;
    private String status;

    public ServiceOrder(String licencePlate) {
        this.licencePlate = licencePlate;
        this.services = new ArrayList<>();
        this.status = "Open";
    }

    public void addService(MotoService service) {
        if (status.equalsIgnoreCase("Open")) {
            services.add(service);
            System.out.println("Service added " + service.getDescriptions());
        } else {
            System.out.println("The service order is closed. You cannot add new services.");
        }
    }

    public void closeServiceOrder() {
        this.status = "Close";
        double total = 0.0;
        for (MotoService service : services) {
            total += service.getValue();
        }

        System.out.println("----- Final Receipt -----");
        System.out.println("License plate: " + licencePlate);
        System.out.println("Total amount: $" + total);

    }
}