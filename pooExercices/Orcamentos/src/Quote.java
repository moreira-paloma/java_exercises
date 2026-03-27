import java.util.ArrayList;

public class Quote {

    private String nameClient;
    private ArrayList<Service> listService;
    private Status status;
    //enum comum quando se precisa de status.
    public enum Status{
        Approved,
        Pending,
        Rejected
    }

    public Quote(String nameClient){
        this.nameClient = nameClient;
        this.listService = new ArrayList<>();
        this.status = Status.Pending;
    }

    public void addService(Service service){
        listService.add(service);

    }

    public double calculateTotal(){
       double total = 0;

       for(Service item : listService){
           total += item.getHourlyRate() * item.getEstimatedHours();

       }
        return total;

    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void createReceipt(){
        if(status == Status.Approved){
            System.out.println("O valor é de --- " + calculateTotal());
        }

    }
}
