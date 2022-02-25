package Giris;
import java.util.Scanner;

public class ExponentOfFourAndFive {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = inp.nextInt();

        System.out.print("Exponents of 4 :");

        for (int i = 1; i <= number; i=i*4) {
            System.out.print(i+"\t");
        }
        System.out.print("\n");

        System.out.print("Exponents of 5 :");
        for (int i = 1; i <= number; i=i*5) {
            System.out.print(i+"\t");
        }
    }
}
