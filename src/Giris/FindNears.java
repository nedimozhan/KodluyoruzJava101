package Giris;
import java.util.Scanner;

public class FindNears {
    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter number : ");
        int number = scan.nextInt();

        int min = list[0];
        int max = list[0];
        int distance_min = Math.abs(number-min);
        int distance_max = Math.abs(max - number);
        int temp;

        for (int i = 1; i < list.length; i++) {
            temp = Math.abs(number-list[i]);
            if(distance_max>temp && number<list[i]){
                max = list[i];
                distance_max = temp;
            }
            else if(distance_min>temp && number>list[i]){
                min = list[i];
                distance_min = temp;
            }
        }

        if(min>number){System.out.println("There is no element that small than the given number or bigger than the given number"); return;}
        System.out.println("The nearest smaller number  :" + min);
        System.out.println("The nearest bigger number  :" + max);











    }
}
