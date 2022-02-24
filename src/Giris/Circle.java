package Giris;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter r pf the circle :");
        double r = input.nextDouble();

        System.out.print("Please enter a of the circle : ");
        double a = input.nextDouble();

        double pi = 3.140;

        double result = r*r*pi*a/360;

        System.out.println("The area of the piece of the circle is :" + result);







    }



}
