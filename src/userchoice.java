import java.util.Scanner;

public class userchoice {
    public static void user_choice() {
            Scanner u = new Scanner(System.in);
            System.out.println("...Welcome to license management....");
            System.out.println("Please select an option:");
            System.out.println(" 1)Register \n 2)Login \n 3)Exit (1/2/3): ");
            String user_input = u.nextLine();
            switch (user_input) {
                case "1":
                    register.registration();
                    break;
                case "2":
                    login.logininfo();
                    break;
                case "3":
                    System.out.println("Exiting the program.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid option!");

            }
        }
    }
