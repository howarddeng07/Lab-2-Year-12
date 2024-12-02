import java.util.ArrayList;
import java.util.List;
class Standard extends Passenger {
    private int balance;
    private List<Activity> activities = new ArrayList<>();

    public Standard(String name, int number, int balance) {
        super(name, number);
        this.balance = balance;
    }

    @Override
    public void signUpForActivity(Activity activity, Destination destination) {
        if (activity.cost <= balance && activity.capacity > 0) {
            balance -= activity.cost;
            activities.add(activity);
            activity.capacity--;
            System.out.println(name + " signed up for " + activity.name + " in " + destination.getName());
        } else {
            System.out.println(name + " cannot sign up for " + activity.name + ": Insufficient balance or full capacity.");
        }
    }
}