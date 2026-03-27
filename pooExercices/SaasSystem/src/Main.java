public class Main {
    public static void main(String[] args) {

        Subscription subscription = new Subscription("Paloma",true);

        System.out.println("_____ Checking access _____");
        System.out.println("User: " + subscription.getUserName());
        subscription.checkAccess();
        subscription.upgrade();
        subscription.checkAccess();
        subscription.cancelSubscription();
        subscription.checkAccess();
    }
}
