public abstract class Passenger {
    protected String name;
    protected int number;

    public Passenger(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public abstract void signUpForActivity(Activity activity, Destination destination);

    @Override
    public String toString() {
        return "Passenger " + number + ": " + name;
    }
}