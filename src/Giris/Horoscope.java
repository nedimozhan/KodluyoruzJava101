package Giris;
import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your number that your birth day : ");
        byte birthDay = inp.nextByte();

        System.out.print("Please enter your number that your month day : ");
        byte monthDay = inp.nextByte();

        if(monthDay==1){
            if(birthDay<=21 && birthDay>=1){
                System.out.print("Goat");
            }
            else if(birthDay>=22 && birthDay<32){
                System.out.print("Aquarius");
            }
        }
        else if(monthDay==2){
            if(birthDay<=19 && birthDay>=1){
                System.out.print("Aquarius");
            }
            else if(birthDay>=20 && birthDay<32){
                System.out.print("Pisces");
            }
        }
        else if(monthDay==3){
            if(birthDay<=20 && birthDay>=1){
                System.out.print("Pisces");
            }
            else if(birthDay>=21 && birthDay<32){
                System.out.print("Aries");
            }
        }
        else if(monthDay==4){
            if(birthDay<=20 && birthDay>=1){
                System.out.print("Aries");
            }
            else if(birthDay>=21 && birthDay<32){
                System.out.print("Taurus");
            }
        }
        else if(monthDay==5){
            if(birthDay<=21 && birthDay>=1){
                System.out.print("Taurus");
            }
            else if(birthDay>=22 && birthDay<32){
                System.out.print("Gemini");
            }
        }
        else if(monthDay==6){
            if(birthDay<=22 && birthDay>=1){
                System.out.print("Gemini");
            }
            else if(birthDay>=23 && birthDay<32){
                System.out.print("Cancer");
            }
        }
        else if(monthDay==7){
            if(birthDay<=22 && birthDay>=1){
                System.out.print("Cancer");
            }
            else if(birthDay>=23 && birthDay<32){
                System.out.print("Leo");
            }
        }
        else if(monthDay==8){
            if(birthDay<=20 && birthDay>=1){
                System.out.print("Leo");
            }
            else if(birthDay>=23 && birthDay<32){
                System.out.print("Virgo");
            }
        }
        else if(monthDay==9){
            if(birthDay<=22 && birthDay>=1){
                System.out.print("Virgo");
            }
            else if(birthDay>=23 && birthDay<32){
                System.out.print("Libra");
            }
        }
        else if(monthDay==10){
            if(birthDay<=22 && birthDay>=1){
                System.out.print("Libra");
            }
            else if(birthDay>=23 && birthDay<32){
                System.out.print("Scorpio");
            }
        }
        else if(monthDay==11){
            if(birthDay<=21 && birthDay>=1){
                System.out.print("Scorpio");
            }
            else if(birthDay>=22 && birthDay<32){
                System.out.print("Sagittarius");
            }
        }
        else if(monthDay==12){
            if(birthDay<=21 && birthDay>=1){
                System.out.print("Sagittarius");
            }
            else if(birthDay>=22 && birthDay<32){
                System.out.print("Goat");
            }
        }
        else{
            System.out.print("Error ! ");
        }









    }
}
