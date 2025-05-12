import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

class register {
    public String licenseType = "None"; // A, B, or K
    public String licenseStatus = "Not Applied"; // Pending, Approved, Rejected
    public String dob;
    public  static String  admin_username;
    public  static String admin_password;
    public  static ArrayList<register> register_user_or_admin = new ArrayList<>();
    public int usernameID;
    public String name;
    public String password;
    public String email;
    public register(Integer usernameID, String name, String password, String email,String dob) {
        this.usernameID = usernameID;
        this.email = email;
        this.name = name;
        this.password = password;
        this.dob= dob;
    }
    public static void registration() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter user Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your full name: ");
            String name = sc.nextLine();
            System.out.print("Enter a password: ");
            String pass = sc.nextLine();
            System.out.print("Enter an email: ");
            String e = sc.nextLine();
            System.out.println("Enter date of birth: ");
            String DOB = sc.nextLine();
            System.out.println("Select user or admin:");
            String a = sc.nextLine();

                if (a.equals("admin")) {
                    System.out.print("Enter admin username: ");
                    admin_username = sc.nextLine();
                    System.out.print("Enter admin password: ");
                    admin_password = sc.nextLine();
                    System.out.println("Admin registration successful.");
                } else if (a.equals("user")) {
                    System.out.println("Registration as user successful");
                    register_user_or_admin.add(new register(id, name, pass, e, DOB));
                } else {
                    System.out.println("Please select valid option.");

                }

        if (!isValidAge(DOB)) {
            System.out.println("You must be 18 or above to register.");
            return;
        }
    }

    public static boolean isValidAge(String dob) {
        try {
            // Parse the date of birth using LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate birthDate = LocalDate.parse(dob, formatter);

            // Get the current date
            LocalDate today = LocalDate.now();

            // Calculate age
            int age = today.getYear() - birthDate.getYear();

            // Adjust age if the user's birthday hasn't occurred yet this year
            if (today.isBefore(birthDate.plusYears(age))) {
                age--;
            }

            return age >= 18; // Return true if 18 or older
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use dd-MM-yyyy.");
            return false; // Invalid date format
        }
    }

    public static String admin_username() {
        return admin_username;
    }
    public static String admin_password() {
        return admin_password;
    }
}