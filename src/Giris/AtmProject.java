package Giris;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName,password;
        int right=3;
        int select;
        int balance=0;
        int price;

        while(right>0){
            System.out.print("Please enter your username : ");
            userName = inp.nextLine();

            System.out.print("Please enter your password : ");
            password = inp.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){

                System.out.println("You have entered the system");
                do {
                    System.out.print("1-Cash deposit \t 2-Drawing Cash \t 3-Balance Inquiry \t 4-Sign Out");
                    System.out.print("\n");
                    System.out.print("Please choose an operation what you want : ");
                    select = inp.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Please enter amount : ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Please enter amount : ");
                            price = inp.nextInt();
                            if(balance-price>=0){
                                balance -= price;
                            }
                            else{
                                System.out.print("Insufficient balance !");
                            }
                            break;
                        case 3:
                            System.out.print("Your balance : "+balance);
                    }
                }
                while(select!=4);
                break;
            }
            else{
                System.out.print("Wrong username or password !");
                right--;
                if(right==0){
                    System.out.print("Your account has been blocked ! ");
                }
                else{
                    System.out.print("Your remaining right is : "+right);
                }
            }

        }










    }
}
