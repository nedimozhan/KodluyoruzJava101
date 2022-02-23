package Giris;
import java.util.Scanner;

public class PracticeKDV {
    public static void main(String[] args) {

        // The KDV prices determined as %18
        Scanner input = new Scanner(System.in);
        double KDV = 0.18;
        System.out.print("Please enter the amount : ");
        double price = input.nextDouble();

        System.out.println("Without KDV : "+price);
        System.out.println("Price with KDV : "+ (price+(price*KDV)));
        System.out.println("Price of KDV: "+ (price*KDV));














    }
}
