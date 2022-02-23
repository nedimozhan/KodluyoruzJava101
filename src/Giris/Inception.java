package Giris;
import java.util.Scanner;

public class Inception {
    public static void main(String[] args) {
        int Mathematics, Physic, Chemistry, Turkish, History, Music;
        float Average;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter grade of mathmatic");
        Mathematics = input.nextInt();

        System.out.println("Please enter grade of physic");
        Physic = input.nextInt();

        System.out.println("Please enter grade of chemistry");
        Chemistry = input.nextInt();

        System.out.println("Please enter grade of turkish");
        Turkish = input.nextInt();

        System.out.println("Please enter grade of history");
        History = input.nextInt();

        System.out.println("Please enter grade of music");
        Music = input.nextInt();

        Average = (Mathematics+Physic+Chemistry+Turkish+History+Music)/6;
        System.out.println("Average is : "+Average);

        boolean control = Average >= 60;

        String answer = control ? "Lessons passed" : "Lessons missed";
        System.out.println(answer);
    }
}
