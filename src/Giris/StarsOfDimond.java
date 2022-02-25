package Giris;
import java.util.Scanner;

public class StarsOfDimond {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = inp.nextInt();
        boolean control=false;


        if(number%2==0){
            int median = number/2;
            int width = median * 2 -1;
            int boundry1 =  width/2 +1;
            int boundry2 = boundry1;

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= boundry2; j++) {
                    if(boundry1<=j && boundry2>=j){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
                if(i>=median+1){
                    control=true;
                }
                if(control==true){
                    boundry2--;
                    boundry1++;
                }
                else{
                    if(median!=i){
                        boundry2++;
                        boundry1--;
                    }
                }
            }


        }
        else{
            int median = number/2 + 1;
            int width = median * 2 -1;
            int boundry1 =  width/2 +1;
            int boundry2 = boundry1;

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= boundry2; j++) {
                    if(boundry1<=j && boundry2>=j){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
                if(i>=median){
                    control=true;
                }
                if(control==true){
                    boundry2--;
                    boundry1++;
                }
                else{
                    boundry2++;
                    boundry1--;
                }
            }

        }
    }
}
