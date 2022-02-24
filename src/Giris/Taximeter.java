package Giris;
import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter how many kilometers you traveled : ");
        double km = input.nextDouble();
        double price = 10 + km*2.2;
        double realPrice =  price<20 ? 20:price;

        System.out.print("The price displayed on the taximeter : " + realPrice);


    }
}
