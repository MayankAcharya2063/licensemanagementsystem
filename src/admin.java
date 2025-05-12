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
    System.out.println("\n--- License Applications ---");
    for (register reg : register.register_user_or_admin) {
        if (!reg.licenseStatus.equals("Not Applied")) {
            System.out.println("ID: " + reg.usernameID + ", Name: " + reg.name + ", License Type: " + reg.licenseType + ", Status: " + reg.licenseStatus);
        }
    }
    System.out.println("Enter user ID to update status or 0 to exit:");
    int targetId = sc.nextInt();
    sc.nextLine();
    if (targetId != 0) {
        for (register reg : register.register_user_or_admin) {
            if (reg.usernameID == targetId) {
                System.out.println("Approve or Reject license? (A/R): ");
                String decision = sc.nextLine();
                if (decision.equalsIgnoreCase("A")) {
                    reg.licenseStatus = "Approved";
                } else if (decision.equalsIgnoreCase("R")) {
                    reg.licenseStatus = "Rejected";
                }
                System.out.println("Updated status: " + reg.licenseStatus);
                break;
            }
        }
    }
}
}
