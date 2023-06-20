import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        

        AirportSystem airportSystem = new AirportSystem();


        // Add airports
        airportSystem.addAirport("SYD");
        airportSystem.addAirport("ADL");
        airportSystem.addAirport("MEL");
        airportSystem.addAirport("PER");
        airportSystem.addAirport("BNE");
        airportSystem.addAirport("CBR");
        airportSystem.addAirport("HBA");
        airportSystem.addAirport("DRW");
        airportSystem.addAirport("CNS");

        // Add Flight Paths
        airportSystem.addFlight("SYD", "ADL", 1150);
        airportSystem.addFlight("SYD", "MEL", 870);
        airportSystem.addFlight("SYD", "PER", 3300);
        airportSystem.addFlight("SYD", "BNE", 730);
        airportSystem.addFlight("SYD", "CBR", 240);
        airportSystem.addFlight("SYD", "HBA", 1050);
        airportSystem.addFlight("SYD", "DRW", 3860);
        airportSystem.addFlight("SYD", "CNS", 2420);

        airportSystem.addFlight("ADL", "MEL", 650);
        airportSystem.addFlight("ADL", "PER", 2130);
        airportSystem.addFlight("ADL", "BNE", 2040);
        airportSystem.addFlight("ADL", "CBR", 1000);
        airportSystem.addFlight("ADL", "HBA", 1150);
        airportSystem.addFlight("ADL", "DRW", 3030);
        airportSystem.addFlight("ADL", "CNS", 2970);

        airportSystem.addFlight("MEL", "PER", 2720);
        airportSystem.addFlight("MEL", "BNE", 1650);
        airportSystem.addFlight("MEL", "CBR", 470);
        airportSystem.addFlight("MEL", "HBA", 650);
        airportSystem.addFlight("MEL", "DRW", 3580);
        airportSystem.addFlight("MEL", "CNS", 2540);

        airportSystem.addFlight("PER", "BNE", 4140);
        airportSystem.addFlight("PER", "CBR", 3300);
        airportSystem.addFlight("PER", "HBA", 3300);
        airportSystem.addFlight("PER", "DRW", 410);
        airportSystem.addFlight("PER", "CNS", 2700);
    
        // Number of airports
        System.out.println("Number of Airports: " + airportSystem.getNumAirports()); 
        // Flights from MEL     
        System.out.println(airportSystem.getFlights("MEL"));

        airportSystem.listAirports();
        
        
    }
}
