import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Passenger> passengers;
    private Plane plane;

    public Flight(String flightNumber,
                  String destination,
                  String departureAirport,
                  String departureTime){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
        this. plane = new Plane(PlaneType.BOEING747);
    }
}
