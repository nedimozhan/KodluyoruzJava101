package Giris;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number :  ");
        float firstNumber = input.nextFloat();
        System.out.print("Please enter second number :  ");
        float secondNumber = input.nextFloat();


        System.out.print("1-Summation \t 2-Substraction \t 3-Multiplication \t 4-Division");

        System.out.print("Please choose an operation above : ");
        int options = input.nextByte();


        switch (options){
            case 1:
                System.out.print("The sum is : "+ (firstNumber+secondNumber));
                break;
            case 2:
                System.out.print("The result of substraction is : "+ (firstNumber-secondNumber));
                break;
            case 3:
                System.out.print("The result of multiplication is : "+ (firstNumber*secondNumber));
                break;
            case 4:
                if(secondNumber!=0){
                    System.out.print("The result of division is : "+ (firstNumber/secondNumber));
                }
                else{
                    System.out.print("A number cant divide by 0");
                }
                break;
            default:
                System.out.print("Wrong operation number ! Please choose an operation in (1,2,3,4)");
        }








    }



}
