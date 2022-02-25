package Giris;
import java.util.Scanner;
import java.lang.Integer;

public class Harmonic {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int number = inp.nextInt();
        float result = 0f;

        for (int i = 1; i <=number ; i++) {
            result += 1/(float)i;
        }

        System.out.print("The result is : " + result);
    }
}
