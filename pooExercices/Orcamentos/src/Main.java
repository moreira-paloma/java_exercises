public class Main {
    public static void main(String[] args) {

        Quote quote = new Quote("Paloma");
        Quote quote1 = new Quote("Manuela");
        System.out.println("________________________");
        Service service = new Service(20, 5, "Cleaning");
        Service service1 = new Service(50, 3, "IT Service");

        quote.addService(service);
        quote.addService(service1);

        quote.setStatus(Quote.Status.Approved);
        quote.calculateTotal();
        quote.createReceipt();
        System.out.println("_______________");


    }
}
