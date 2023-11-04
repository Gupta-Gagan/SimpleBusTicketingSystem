import java.util.HashMap;

public class CRUD extends Passenger{

    private String destination;

    private int noOfPassenger;

    Passenger passenger;



    public CRUD(String name, int age, String destination, int noOfPassenger){
        super(name,age);
        this.destination = destination;
        this.noOfPassenger = noOfPassenger;

    }


    HashMap<String,Double> Destinations = getDestinations();

    public void BookTicket(){
        System.out.println("Ticket Booked ...");
        System.out.println("Passenger Details :");
        System.out.println("Passenger Name: "+ this.getName());
        System.out.println("Passenger Destination: "+ this.destination);
        System.out.println("FARE PRICE: Rs." + Destinations.get(destination));
    }
}
