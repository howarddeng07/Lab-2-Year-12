class WalkingTour extends Activity {
    private int distance;

    public WalkingTour(String name, String description, int cost, int capacity, int distance) {
        super(name, description, cost, capacity);
        this.distance = distance;
    }

    @Override
    public String toString() {
        return super.toString() + ", Distance: " + distance + " km";
    }
}