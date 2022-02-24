package Giris;
import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float perPrice=0.1f;

        System.out.print("Please enter age of the traveller : ");
        int age = inp.nextInt();

        System.out.print("Please enter kilometer : ");
        float  km = inp.nextFloat();

        System.out.print(" 1-One Way\t2-Round Trip");
        byte ticket = inp.nextByte();

        if(age<1 || km<=0 || (ticket!=1 && ticket!=2)){
            System.out.print("You have entered wrong data !");
            return;
        }

        float totalPrice = km*perPrice;

        if(age<12){
            totalPrice = totalPrice/2;
        }
        else if(age>=12 && age<=24){
            totalPrice = totalPrice-(totalPrice/10);
        }
        else if(age>65){
            totalPrice = totalPrice-(totalPrice * 3 / 10);
        }

        if(ticket==2){
            totalPrice = totalPrice-(totalPrice/5);
        }

        System.out.print("Total Price : "+totalPrice);











    }
}
