public class Subscription {

    private String userName;
    private boolean statusActive;
    private enum SubscriptionPlan{
        Free,
        Premium
    }
    private SubscriptionPlan plan; //errei aqui

    public Subscription(String userName,boolean statusActive){
        this.userName = userName;
        this.statusActive = statusActive;
        this.plan = SubscriptionPlan.Free; //travei aqui
    }

    public void upgrade(){
        this.plan = SubscriptionPlan.Premium; //travei aqui
        System.out.println("Subscription upgraded to Premium.");
    }

    public void cancelSubscription(){
        this.statusActive = false;
       this.plan = SubscriptionPlan.Free; // travei
        System.out.println("Subscription canceled.");

        }

    public void checkAccess(){
        if(plan == SubscriptionPlan.Premium && statusActive){ // travei aqui
            System.out.println("Access to Premium courses.");
        } else{
            System.out.println("Access denied. Please upgrade");
        }

    }

    public String getUserName() {
        return userName;
    }

    public boolean isStatusActive() {
        return statusActive;
    }
}
