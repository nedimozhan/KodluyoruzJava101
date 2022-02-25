package Giris;
import java.util.Scanner;

public class MultipleOfFour {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int sum = 0;

        while(true){
            System.out.print("Please enter a number : ");
            int number = inp.nextInt();
            if(number%4==0){
                sum+=number;
                System.out.println("Sum is : " + sum);
            }
            else if(number%2==1){
                break;
            }
        }



    }
}
