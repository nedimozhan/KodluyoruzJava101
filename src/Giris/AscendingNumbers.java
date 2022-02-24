package Giris;
import java.util.Scanner;


public class AscendingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number a : ");
        int numberA = input.nextInt();

        System.out.print("Please enter number b : ");
        int numberB = input.nextInt();

        System.out.print("Please enter number c : ");
        int numberC = input.nextInt();


        if(numberA<numberB && numberA<numberC){
            if(numberB<numberC){
                System.out.print("a < b < c");
            }
            else{
                System.out.print("a < c < b");
            }
        }
        else if(numberB<numberA && numberB<numberC){
            if(numberA<numberC){
                System.out.print("b < a < c");
            }
            else{
                System.out.print("b < c < a");
            }
        }
        else{
            if(numberB<numberA){
                System.out.print("c < b < a");
            }
            else{
                System.out.print("c < a < b");
            }
        }










    }
}
