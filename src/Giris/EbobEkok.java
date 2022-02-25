package Giris;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter first number : ");
        int firstNumber = inp.nextInt();

        System.out.print("Please enter second number : ");
        int secondNumber = inp.nextInt();

        int max;
        int min;
        if(firstNumber>secondNumber){
            max = firstNumber;
            min = secondNumber;
        }
        else{
            min = firstNumber;
            max = secondNumber;
        }
        int counter=min;
        //EBOB
        while(counter>0){

            if(max%counter==0 && min%counter==0){
                System.out.print("EBOB : "+counter);
                break;
            }
            counter--;
        }

        System.out.print("\n");

        int coefficient=2;
        while(true){

            if((max*coefficient)%min==0){
                System.out.print("EKOK : "+max*coefficient);
                break;
            }
            coefficient++;
        }
    }
}
