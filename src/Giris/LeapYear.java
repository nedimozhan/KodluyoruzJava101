package Giris;
import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a year : ");
        int year = inp.nextInt();

        if(year%4==0 && year%100!=0){
            System.out.print("The year "+year+ "is a leap year" );
        }
        else if(year%400==0){
            System.out.print("The year "+year+ " is a leap year" );
        }
        else{
            System.out.print("The year "+year+ " is not a leap year" );
        }
    }
}
