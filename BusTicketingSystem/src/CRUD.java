import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CRUD extends Passenger{



    private String destination;
    Scanner sc = new Scanner(System.in);
    private int noOfPassenger;
    public HashMap<String,Double> dest = new HashMap<>();
    HashMap<String,Double> Desti;


    public CRUD(){}
    public CRUD(String name, int age, int noOfPassenger){
        super(name,age);
        this.noOfPassenger = noOfPassenger;
        Desti = setDestinations(dest);

    }




    public void BookTicket(String destin){
        this.setDestination(destin);
        double AccountBalance = getAccountBalance();
        if(AccountBalance <  Desti.get(destin)){
            System.out.println("Insufficient Balance.");
        }
        else {
            AccountBalance = AccountBalance - Desti.get(destin);
            setAccountBalance(AccountBalance);
            System.out.println("Ticket Booked ...");
            System.out.println("Passenger Details :");
            System.out.println("Passenger Name: " + this.getName());
            System.out.println("Passenger Destination: " + this.destination);
            System.out.println("FARE PRICE: Rs." + dest.get(destination));
            System.out.println("Your Account Balance is: " + getAccountBalance());

        }
    }





    public void ViewAllDestination(){


                System.out.println("Destination:                 Fare:");
                for (HashMap.Entry<String, Double> mp : Desti.entrySet()) {
                    System.out.println(mp.getKey() + "      ---------->     " + mp.getValue());
                }




    }

    public void setDestination(String destination){
        this.destination = destination;
    }




}
