package Giris;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter count of digits : ");
        int digit = inp.nextInt();
        int a=0;
        int b=1;
        int c;


        for (int i = 0; i <digit ; i++) {
            System.out.print(a+"\t");
            c = a+b;
            a=b;
            b=c;
        }



    }
}
