import java.util.*;
import java.util.List;
public class AirportSystem {
    
    // Airport count
    int numAirports;
    HashMap<String, List<Edge>> adjList;

    public AirportSystem(){
        this.numAirports = 0;
        this.adjList = new HashMap<String, List<Edge>>();
    }


    // Add airport to the system
    public void addAirport(String airportName){
        if(!adjList.containsKey(airportName)){
            adjList.put(airportName, new ArrayList<Edge>());
            numAirports++;
        }
    }

    // Add flight to the system
    public void addFlight(String source, String destination, int distance){
        if(adjList.containsKey(source) && adjList.containsKey(destination)){
            // Adds edge to both airports since it is a bidirectional flight
            adjList.get(source).add(new Edge(destination, distance));
            adjList.get(destination).add(new Edge(source, distance));
        }
        else{
            System.out.println("One or more airports do not exist");
        }
    }
    // Get all flights (edges) from a specific airport (vertex)
    public List<Edge> getFlights(String airportName){
        if(!adjList.containsKey(airportName)){
            return null;
        }

        System.out.println("Flights from " + airportName + ":");

        for(int i = 0; i < adjList.get(airportName).size(); i++){
            System.out.println(adjList.get(airportName).get(i).destination + " - " + adjList.get(airportName).get(i).distance + "km");
        }
        return adjList.get(airportName);
    }

    // Get all airports in the system
    public void listAirports(){
        System.out.println("Airports in the system:");
        for(String airport : adjList.keySet()){
            System.out.println(airport);
        }
    }



    // Number of airports in the system
    public int getNumAirports(){
        return numAirports;
    }

   
 

    





    
}


