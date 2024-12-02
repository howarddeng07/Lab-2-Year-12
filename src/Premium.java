import java.util.ArrayList;
import java.util.List;

class Premium extends Passenger {
    private List<Activity> activities = new ArrayList<>();

    public Premium(String name, int number) {
        super(name, number);
    }

    @Override
    public void signUpForActivity(Activity activity, Destination destination) {
        if (activity.capacity > 0) {
            activities.add(activity);
            activity.capacity--;
            System.out.println(name + " signed up for " + activity.name + " in " + destination.getName() + " for free.");
        } else {
            System.out.println(name + " cannot sign up for " + activity.name + ": Full capacity.");
        }
    }
}