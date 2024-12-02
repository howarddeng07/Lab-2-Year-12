import java.util.Arrays;
//In this Main class, I modelled some scenarios to test the functionalities of my program.
public class Main {
    public static void main(String[] args) {

        // Scenario 1: Create a Cruise Ship and add Destinations with Activities
        System.out.println("Scenario 1: Initialize Cruise Ship and add destinations with activities.");
        CruiseShip myShip = new CruiseShip("Mayflower", 3);
        Destination hongKong = new Destination("Hong Kong");
        Destination sydney = new Destination("Sydney");

        hongKong.addActivity(new Attraction("Room 512", "Tour of the historic classroom where Jesus legendarily taught Computer Science to his disciples", 50, 10));
        hongKong.addActivity(new WalkingTour("Braemar Hill Walk", "Trek through the majestic Braemar Hill, remember to bring your cameras!", 20, 15, 5));
        sydney.addActivity(new TheatreShow("Deng's Theatre Production", "Live performance in the Sydney Opera House of Tony winning musical 'The Tragedy of Zifu'", 100, 1, Arrays.asList("Zifu Yang", "Howard Deng"), Arrays.asList("Lead", "Support")));

        myShip.addDestination(hongKong);
        myShip.addDestination(sydney);

        // Scenario 2: Add Passengers and try to sign them up for activities
        //This should print out the following:
        //Howard signed up for Room 512 in Hong Kong
        //Sander signed up for Braemar Hill Walk in Hong Kong with discount.
        //Alex signed up for Deng's Theatre Production in Sydney for free.
        System.out.println("\nScenario 2: Add passengers and sign them up for activities.");
        Standard passenger1 = new Standard("Howard", 101, 150);
        Senior passenger2 = new Senior("Sander", 102, 80);
        Premium passenger3 = new Premium("Alex", 103);

        myShip.addPassenger(passenger1);
        myShip.addPassenger(passenger2);
        myShip.addPassenger(passenger3);

        // Attempting to sign up for activities
        passenger1.signUpForActivity(hongKong.getActivities().get(0), hongKong); // Should succeed
        passenger2.signUpForActivity(hongKong.getActivities().get(1), hongKong); // Should succeed with discount
        passenger3.signUpForActivity(sydney.getActivities().get(0), sydney); // Should succeed for free

        // Scenario 3: Print Ship and Itinerary Details
        //This should print out the following:
        //Ship Name: Mayflower
        //Passenger Capacity: 3
        //Current Number of Passengers: 3
        // Passenger 101: Howard
        // Passenger 102: Sander
        // Passenger 103: Alex
        //Itinerary for Mayflower
        //Destination: Hong Kong
        //Activity: Room 512 - Tour of the historic classroom where Jesus legendarily taught Computer Science to his disciples | Cost: 50, Capacity: 9
        //Activity: Braemar Hill Walk - Trek through the majestic Braemar Hill, remember to bring your cameras! | Cost: 20, Capacity: 14, Distance: 5 km
        // Destination: Sydney
        //Activity: Deng's Theatre Production - Live performance in the Sydney Opera House of Tony winning musical 'The Tragedy of Zifu' | Cost: 100, Capacity: 0, Stars: Zifu Yang as Lead, Howard Deng as Support
        System.out.println("\nScenario 3: Print ship and itinerary details.");
        myShip.printShipDetails();
        myShip.printItinerary();

        // Scenario 4: Attempt to overfill the ship
        //This should print out the following:
        //Cannot add more passengers: Ship is at full capacity.
        System.out.println("\nScenario 4: Attempt to add more passengers than the ship capacity.");
        myShip.addPassenger(new Standard("Katie", 104, 100)); // Should fail due to capacity limit

        // Scenario 5: Check capacity handling by signing up another passenger for an already full activity
        //This should print out the following:
        //Cannot add more passengers: Ship is at full capacity.
        //Emily cannot sign up for Deng's Theatre Production: Full capacity.
        System.out.println("\nScenario 5: Attempt to sign up for a full activity.");
        Premium passenger4 = new Premium("Emily", 105);
        myShip.addPassenger(passenger4);
        passenger4.signUpForActivity(sydney.getActivities().get(0), sydney);  // Should fail, activity full after Alex's signup

        // Scenario 6: Check balance handling by signing up a passenger with insufficient balance
        //This should print out the following:
        //Sander signed up for Braemar Hill Walk in Hong Kong with discount.
        //Sander cannot sign up for Room 512: Insufficient balance or full capacity.
        System.out.println("\nScenario 6: Attempt to sign up for an activity with sufficient balance."); //Should fail for second activity due to insufficient balance from signing up for the first activity.
        passenger2.signUpForActivity(hongKong.getActivities().get(1), hongKong); //Should succeed
        passenger2.signUpForActivity(hongKong.getActivities().get(0), hongKong); //Should fail, insufficient balance
    }
}