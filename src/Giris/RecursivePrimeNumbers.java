package Giris;
import java.util.Scanner;

public class RecursivePrimeNumbers {

    static boolean primeNumber(int number,int divisor){

        if(divisor==1){
            return true;
        }
        if(number%divisor==0){
            return false;
        }

        return primeNumber(number,divisor-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scan.nextInt();

        if(number<2){
            System.out.print("Not a prime number");
        }
        else{
            if(primeNumber(number,number-1)==false){
                System.out.print("Not a prime number");
            }
            else{
                System.out.print("The number is a prime number");
            }
        }
    }
}
