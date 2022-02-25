package Giris;
import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter n : ");
        int n = inp.nextInt();

        System.out.print("Please enter r : ");
        int r = inp.nextInt();

        // C(n,r) = n! / (r! * (n-r)!)

        int n_fact = 1;
        int r_fact = 1;
        int n_r_fact = 1;
        for (int i = 2; i <= n; i++) {
            n_fact = n_fact*i;
        }

        for (int i = 2; i <= r; i++) {
            r_fact = r_fact*i;
        }

        for (int i = 2; i <= n-r; i++) {
            n_r_fact = n_r_fact*i;
        }

        System.out.print("Result is : " + n_fact/(r_fact*n_r_fact));








    }
}
