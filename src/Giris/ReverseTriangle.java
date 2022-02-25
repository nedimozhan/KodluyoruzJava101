package Giris;
import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter count of triangle's digits : ");
        int digits = inp.nextInt();

        int left = 0;
        int right = digits*2-1;

        for (int i = 0; i < digits; i++) {
            for (int j = 0; j <= right-1; j++) {
                if(j>=left && j<=right){System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.print("\n");
            left++;
            right--;
        }








    }
}
