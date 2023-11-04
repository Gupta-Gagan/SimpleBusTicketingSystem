import java.util.Scanner;

public class LoginPage extends CRUD {

    Scanner sc = new Scanner(System.in);
    String UserName;
    String UserPassword;

    String ID;
    String PASSWORD;

    LoginPage(){}

    LoginPage(String name, int age, int noofperson, String pass ){
        super(name,age,noofperson);
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
        System.out.print("Set your Name: ");
        UserName = sc.next();
        System.out.print("Set your Password: ");
        UserPassword = sc.next();
    }

}
