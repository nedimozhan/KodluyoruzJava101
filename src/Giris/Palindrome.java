package Giris;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = inp.nextInt();
        int digit = 1;
        int leftDivisor = 10;
        int rightDivisor = 10;
        while(number/leftDivisor!=0){

            digit++;
            leftDivisor = leftDivisor*10;

        }

        leftDivisor=leftDivisor/10;


        while(leftDivisor!=rightDivisor && leftDivisor>0){
            System.out.print("LEFT : "+number/leftDivisor + " Rıght : "+number%rightDivisor+"\n");
            if(number/leftDivisor != number%rightDivisor){
                System.out.print("This number not a palindrome number");
                return;
            }
            number = number%leftDivisor;
            number = number/10;
            leftDivisor=leftDivisor/100;
        }

        System.out.print("The number is palindrome number");

    }
}
