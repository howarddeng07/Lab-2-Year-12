public class Activity {
    protected String name;
    protected String description;
    protected int cost;
    protected int capacity;

    public Activity(String name, String description, int cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " - " + description + " | Cost: " + cost + ", Capacity: " + capacity;
    }
}