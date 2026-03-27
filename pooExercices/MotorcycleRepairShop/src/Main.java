import java.security.Provider;

public class Main {
    public static void main(String[] args) {


        ServiceOrder order = new ServiceOrder("ABC123");

        MotoService service1 = new MotoService("Oil change", 120.0);
        MotoService service2= new MotoService("Brake adjustment", 80.0);

        order.addService(service1);
        order.addService(service2);

        order.closeServiceOrder();


    }
}
