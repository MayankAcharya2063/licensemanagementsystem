import java.util.Scanner;
public class login {
    public static void logininfo()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("(1)User   \n(2)Admin \n(3)Main menu (enter 1/2/3) :");
            int user_choice=sc.nextInt();
            switch(user_choice){
                case 1:
                    user.user_login();
                    break;
                case 2:
                    admin.admin_permission();
                    break;
                case 3:
                    userchoice.user_choice();
                    break;
                default:
                    System.out.println("Enter valid option!");
            }
}
}
