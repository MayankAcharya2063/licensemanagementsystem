import java.util.Scanner;

public class user {
    public static void user_login(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter user ID: ");
        int id=sc.nextInt();
        System.out.print("Enter password: ");
        String pass=sc.next();

        for (register reg: register.register_user_or_admin) {

        if(reg.usernameID==id && reg.password.equals(pass)) {

            System.out.println("Login successful! Welcome " + reg.name);
            System.out.print("1) Apply for new license \n 2)Check status \n 3)Logout to main menu (Please select an option: 1/2/3) ");
            int u_choice = sc.nextInt();
            switch (u_choice) {
                case 1:
                    System.out.println("......Choose type of license you want to apply for! (A/B/K) ......");
                    System.out.print("A)2 wheeler bike  B)Car  K)Scooter :");
                    reg.licenseType = sc.next().toUpperCase();
                    reg.licenseStatus = "Pending";
                    System.out.println("License application submitted. Status: Pending");
                break;
                case 2:
                    System.out.println("Your license application status: " + reg.licenseStatus);
                    System.out.println("License type applied: " + reg.licenseType);
                    break;

                    case 3:
                        System.out.println("....Exiting to main menu....");
                        userchoice.user_choice();
             default:
                System.out.println("Please enter valid choice!");
            }

            }

            else {
                System.out.println("User ID or password is incorrect!");
            }
        }
    }
}


