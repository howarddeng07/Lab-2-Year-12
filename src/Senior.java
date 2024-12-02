import java.util.ArrayList;
import java.util.List;

class Senior extends Passenger {
    private int balance;
    private List<Activity> activities = new ArrayList<>();

    public Senior(String name, int number, int balance) {
        super(name, number);
        this.balance = balance;
    }

    @Override
    public void signUpForActivity(Activity activity, Destination destination) {
        int discountedCost = (int) (activity.cost * 0.9);
        if (discountedCost <= balance && activity.capacity > 0) {
            balance -= discountedCost;
            activities.add(activity);
            activity.capacity--;
            System.out.println(name + " signed up for " + activity.name + " in " + destination.getName() + " with discount.");
        } else {
            System.out.println(name + " cannot sign up for " + activity.name + ": Insufficient balance or full capacity.");
        }
    }
}