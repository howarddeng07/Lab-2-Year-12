import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities = new ArrayList<>();

    public Destination(String name) {
        this.name = name;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public String getName() {
        return name;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}