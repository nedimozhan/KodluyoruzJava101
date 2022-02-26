package Giris;
import java.util.Scanner;

public class RecursiveExponentialNumbers {

    public static int powerOfNumbers(int number,int exponent){

        if(exponent==0){return 1;}
        return powerOfNumbers(number,exponent-1)*number;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scan.nextInt();;

        System.out.print("Please enter an exponent number : ");
        int exponent = scan.nextInt();;

        System.out.print("Result : "+powerOfNumbers(number,exponent));



    }

}
