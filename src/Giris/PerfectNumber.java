package Giris;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int number = inp.nextInt();
        int sum=0;
        for(int i=1;i<=number/2;i++){
            if(number%i==0){
                sum+=i;
            }
        }

        if(number!=1 && sum==number){
            System.out.print("This is a perfect number");
        }
        else{
            System.out.print("This is not a perfect number");
        }
    }
}
