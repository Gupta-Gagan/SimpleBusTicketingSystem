import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LoginPage obj = new LoginPage();
        Scanner sc = new Scanner(System.in);
        obj.getInfo();
        System.out.println("*********************** Welcome to Bus Ticketing System **********************");
        System.out.println("Login: ");
        System.out.println("Enter your name: ");
        String username = sc.next();
        System.out.println("Enter your Password: ");
        String password = sc.next();



    }
}