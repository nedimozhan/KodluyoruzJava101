package Giris;
import java.util.Scanner;

public class PracticeKDV {
    public static void main(String[] args) {

        // The KDV prices determined as %18
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the amount : ");
        double price = input.nextDouble();

        double KDV = (price>1000) ? 0.8 : 0.18;

        double price_kdv = price + (price*KDV);

        System.out.println("Without KDV : "+price);
        System.out.println("Price with KDV : "+ price_kdv);
        System.out.println("Price of KDV: "+ (price*KDV));














    }
}
