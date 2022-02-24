package Giris;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName = "Kodluyoruz";
        String password = "Kodluyoruz";

        System.out.print("Username : ");
        String inputUsername = input.nextLine();
        System.out.print("Password : ");
        String inputPassword = input.nextLine();

        if(userName.equals(inputUsername) && password.equals(inputPassword)){
            System.out.print("You have entered succesfully logined");
        }
        else if(!password.equals(inputPassword)){

            System.out.print("1-Create New Password \t 2-No Thanks");

            byte choose = input.nextByte();

            switch (choose){
                case 1:
                    System.out.print("Please enter new password : ");

                    String newPassword = input.next();

                    if(password.equals(newPassword)){
                        System.out.print("Couldnt create a new password !");
                    }
                    else{
                        System.out.print("The new password has created ");
                    }
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    }
}
