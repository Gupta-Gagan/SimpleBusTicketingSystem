import java.util.HashMap;

public class Passenger {
    private String name;

    private int age;

    private HashMap<String,Double> Destinations = new HashMap<>();

    public Passenger(String name, int age){
        this.name= name;
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public HashMap<String,Double> getDestinations(){
        return Destinations;
    }



    public Passenger(String name, int age, HashMap<String,Double> dest){
        this.name= name;
        this.age = age;


        dest.put("Chandigarh", 500.0);
        dest.put("Kalka",300.45);
        dest.put("Delhi",957.23);
        dest.put("Shimla",1200.0);
        dest.put("Amritsar",600.94);

        Destinations = dest;
    }



    private void ViewAllDestination(){
        System.out.println("Destination:         Fare:");
        Destinations.forEach((k,v) -> System.out.println(k + ":                   Rs."+v));
    }


}
