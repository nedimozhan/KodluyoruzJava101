package Giris;
import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("How many numbers will you enter : ");
        int N = inp.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int number;


        for (int i = 0; i < N; i++) {
            System.out.print("Please enter a number : ");
            number = inp.nextInt();
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }

        }

        System.out.print("Max : "+max+"\n");
        System.out.print("Min : "+min+"\n");















    }
}
