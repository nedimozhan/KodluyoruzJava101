package Giris;
import java.util.Scanner;

public class ExponentialNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a number :  ");
        int number = inp.nextInt();

        System.out.print("Please enter exponent of the number :  ");
        int exp = inp.nextInt();
        int result=1;

        for (int i = 0; i < exp ; i++) {
            result = number  * result;
        }

        System.out.print("The result is : "+result);





    }
}
