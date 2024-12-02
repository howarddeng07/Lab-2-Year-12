import java.util.ArrayList;
import java.util.List;

public class CruiseShip {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary = new ArrayList<>();
    private List<Passenger> listOfPassengers = new ArrayList<>();

    public CruiseShip(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (listOfPassengers.size() < passengerCapacity) {
            listOfPassengers.add(passenger);
        } else {
            System.out.println("Cannot add more passengers: Ship is at full capacity.");
        }
    }

    public void printShipDetails() {
        System.out.println("Ship Name: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Current Number of Passengers: " + listOfPassengers.size());
        for (Passenger p : listOfPassengers) {
            System.out.println("- " + p);
        }
    }

    public void printItinerary() {
        System.out.println("Itinerary for " + name);
        for (Destination d : itinerary) {
            System.out.println("Destination: " + d.getName());
            for (Activity a : d.getActivities()) {
                System.out.println("  Activity: " + a);
            }
        }
    }
}