package Giris;
import java.util.Scanner;


public class WeatherTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter temperature : ");
        float temp = input.nextFloat();

        // like binary search
        if(temp<=15){
            if(temp<5){
                System.out.print("You can ski");
            }
            else{
                System.out.print("You can go to cinema");
            }
        }
        if(temp>=15){
            if(temp>25){
                System.out.print("You can go to swim");
            }
            else{
                System.out.print("You can go to picnic");
            }
        }










    }
}
