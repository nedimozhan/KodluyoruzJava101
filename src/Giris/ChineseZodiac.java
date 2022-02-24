package Giris;
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter year of your birth");
        int year = inp.nextInt();



        if(year%12==0){
            System.out.print("Your chinese zodiac :  Monkey");
        }
        else if(year%12==1){
            System.out.print("Your chinese zodiac :  Rooster");
        }
        else if(year%12==2){
            System.out.print("Your chinese zodiac :  Dog");
        }
        else if(year%12==3){
            System.out.print("Your chinese zodiac :  Pig");
        }
        else if(year%12==4){
            System.out.print("Your chinese zodiac :  Mouse");
        }
        else if(year%12==5){
            System.out.print("Your chinese zodiac :  Ox");
        }
        else if(year%12==6){
            System.out.print("Your chinese zodiac :  Tiger");
        }
        else if(year%12==7){
            System.out.print("Your chinese zodiac :  Rabbit");
        }
        else if(year%12==8){
            System.out.print("Your chinese zodiac :  Dragon");
        }
        else if(year%12==9){
            System.out.print("Your chinese zodiac :  Snake");
        }
        else if(year%12==10){
            System.out.print("Your chinese zodiac :  Horse");
        }
        else if(year%12==11){
            System.out.print("Your chinese zodiac :  Sheep");
        }









    }
}
