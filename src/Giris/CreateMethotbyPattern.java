package Giris;
import java.util.Scanner;

public class CreateMethotbyPattern {

    public static void Pattern(int N,int realN,int add){

        if(add==5 && N==realN){
            System.out.print(N);
            return;
        }
        if(N<=0){
            if(N==realN){
                System.out.print(N+" ");
                return;}
            add = 5;
        }
        System.out.print(N+" ");
        Pattern(N+add,realN,add);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scan.nextInt();
        int add = -5;
        Pattern(number,number,add);



    }
}
