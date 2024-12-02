import java.util.List;

class TheatreShow extends Activity {
    private List<String> actors;
    private List<String> roles;

    public TheatreShow(String name, String description, int cost, int capacity, List<String> actors, List<String> roles) {
        super(name, description, cost, capacity);
        this.actors = actors;
        this.roles = roles;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append(", Stars: ");
        for (int i = 0; i < actors.size(); i++) {
            if (i > 0) builder.append(", ");
            builder.append(actors.get(i) + " as " + roles.get(i));
        }
        return builder.toString();
    }
}