import sun.security.krb5.internal.crypto.Des;

import java.util.HashMap;

public class Passenger {
    private String name;

    private int age;
    private double accountBalance = 1200.78;

    private HashMap<String,Double> Destinations = new HashMap<>();

    Boolean buyed = false;
    Passenger(){

    }
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

    public HashMap<String,Double> setDestinations(HashMap<String,Double> dest){
        dest.put("Chandigarh", 500.0);
        dest.put("Kalka",300.45);
        dest.put("Delhi",957.23);
        dest.put("Shimla",1200.0);
        dest.put("Amritsar",600.94);

        Destinations.putAll(dest);
        return Destinations;

    }

    public HashMap<String,Double> getDestinations(){
        return Destinations;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void setAccountBalance(Double amt){
        this.accountBalance = amt;
    }












}
