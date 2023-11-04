import java.util.Scanner;

public class LoginPage {

    Scanner sc = new Scanner(System.in);
    String UserName;
    String UserPassword;

    String ID;
    String PASSWORD;

    LoginPage(){}

    LoginPage(String name, String pass){
        this.ID = name;
        this.PASSWORD = pass;
    }

    public void setName(String name){
        this.ID = name;
    }

    public void setPass(String pass){
        this.PASSWORD = pass;
    }

    public void getInfo(){
        System.out.println("***********************  Welcome To Register Page  *******************");
        System.out.println("Set your Name: ");
        UserName = sc.next();
        System.out.println("Set your Password: ");
        UserPassword = sc.next();
    }

}
