package Giris;
import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int number = inp.nextInt();
        int count = 0;
        int sum = 0;


        // 0 included 0%4==0 and 0%3==0
        if(number>0){
            for (int i = 0; i<=number;i++){
                if(i%4==0 && i%3==0){
                    sum+=i;
                    count++;
                }
            }
        }
        else{
            for (int i = 0; i>=number;i--){
                if(i%4==0 && i%3==0){
                    sum+=i;
                    count++;
                }
            }
        }

        System.out.print("Average is : "+sum/count);














    }

}
