package Giris;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height in meters: ");
        float height = input.nextFloat();

        System.out.print("Please enter your weight : ");
        float weight = input.nextFloat();

        //Kilo (kg) / Boy(m) * Boy(m)

        System.out.print("Your body mass index is : "+weight/height*height);

    }
}
