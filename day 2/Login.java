import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Username = "admin";
        String Password = "12345";

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if(username.equals(Username) && password.equals(Password)) {
            System.out.println("Login Successful! Welcome " + username);
        } else {
            System.out.println("Login Failed! Invalid username or password.");
        }

        sc.close();
    }
}
