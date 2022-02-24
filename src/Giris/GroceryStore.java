package Giris;
import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/

        System.out.print("Please enter kilogram of pear :  ");
        double pear = input.nextFloat();

        System.out.print("Please enter kilogram of apple :  ");
        double apple = input.nextFloat();

        System.out.print("Please enter kilogram of tomato :  ");
        double tomato = input.nextFloat();

        System.out.print("Please enter kilogram of banana :  ");
        double banana = input.nextFloat();

        System.out.print("Please enter kilogram of aubergine :  ");
        double aubergine = input.nextFloat();

        System.out.print("Total price is : "+ (2.14*pear + 3.67*apple + 1.11*tomato+0.95*banana+5*aubergine));
        
    }
}
