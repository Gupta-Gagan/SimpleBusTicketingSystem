import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        LoginPage obj = new LoginPage();
        Scanner sc = new Scanner(System.in);
        obj.getInfo();
        String username;
        String password;
        Integer input;
        int age;
        int noOfPerson;
        String destinatiON;

        while((obj.UserName != obj.ID) && (obj.UserPassword != obj.PASSWORD)){
            if((obj.UserName.equals(obj.ID)) && (obj.UserPassword.equals(obj.PASSWORD))){
                break;
            }
            System.out.println("*********************** Welcome to Bus Ticketing System **********************");
            System.out.println("Login: ");
            System.out.print("Enter your name: ");
            username = sc.next();
            obj.setName(username);
            System.out.print("Enter your Password: ");
            password = sc.next();
            obj.setPass(password);

        }

        System.out.println("Enter your Age: ");
        age = sc.nextInt();

        System.out.println("No. Of Persons: ");
        noOfPerson = sc.nextInt();
        CRUD pass = new CRUD(obj.ID,age,noOfPerson);

        while(true){
            System.out.println("---------------   Welcome   -------------------");
            System.out.println("**********************************************");
            System.out.println("**********    Bus Ticketing System    ********");
            System.out.println("**********************************************");
            System.out.println("*** [1] Destination                  *********");
            System.out.println("*** [2] Buy Ticket                   *********");
            System.out.println("*** [3] Transaction                  *********");
            System.out.println("*** [4] View                         *********");
            System.out.println("*** [5] Exit                         *********");
            System.out.println("**********************************************");
            System.out.println("**********************************************");
            System.out.print("Enter the option: ");
            input = sc.nextInt();

            if(input == 1){
                pass.ViewAllDestination();
                System.out.println("you want to buy a ticket [Y/N]: ");
                String inp = sc.next();
                if(inp.equals("N")){
                    System.exit(0);
                }
                else if(inp.equals("Y")){
                    System.out.println("Enter Your Destination: ");
                    String destina = sc.next();
                    pass.setDestination(destina);
                    pass.BookTicket(destina);
                    pass.buyed = true;

                    Thread.sleep(7000);
                }
            }
            else if(input == 2){
                System.out.println("Enter Your Destination: ");
                String destina = sc.next();
                pass.setDestination(destina);
                pass.BookTicket(destina);
                pass.buyed = true;
                Thread.sleep(7000);
            }
            else if(input == 3){
                Double Balance = pass.getAccountBalance();
                System.out.println(Balance);
                Thread.sleep(5000);
            }
            else if(input == 4){
                if(pass.buyed){
                    System.out.println("Your seat has been Booked.");
                    Thread.sleep(5000);
                }
                else{
                    System.out.println("Empty.");
                    Thread.sleep(5000);
                }
            }
            else if(input == 5){
                System.exit(2);
            }
            else{
                System.out.println("Invalid Input");
                Thread.sleep(3000);
            }

        }






    }
}