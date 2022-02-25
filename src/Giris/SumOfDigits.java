package Giris;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a number :  ");
        int number = inp.nextInt();
        int sum=0;

        while(number!=0){
            sum += number % 10;
            number=number/10;
        }

        System.out.print("Result is :  "+sum);




    }
}
