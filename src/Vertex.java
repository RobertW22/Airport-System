import java.util.List;
public class Vertex {
    String airportName;
    int distance;
    List<Edge> edges;

    public Vertex(String airportName, int distance, List<Edge> edges){
        this.airportName = airportName;
        this.distance = distance;
        this.edges = edges;
    }

    public Vertex(){

    }

    public String getAirportName(){
        return airportName;
    }

    public int getDistance(){
        return distance;
    }

    public List<Edge> getEdges(){
        return edges;
    }

    public void setAirportName(String airportName){
        this.airportName = airportName;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }

    public void setEdges(List<Edge> edges){
        this.edges = edges;
    }
}
