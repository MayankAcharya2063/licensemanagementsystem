import java.util.Scanner;

class admin{
public static void admin_permission(){
    String storedAdminUsername = register.admin_username();
    String storedAdminPassword = register.admin_password();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter admin username: ");
    String username = sc.nextLine();
    System.out.print("Enter admin password: ");
    String password = sc.nextLine();
    if (username.equals(storedAdminUsername) && password.equals(storedAdminPassword)) {
        System.out.println("Admin verified successfully!");
        System.out.println("Welcome "+storedAdminUsername);

    } else {
        System.out.println("Invalid admin credentials.");
    }
}
}
