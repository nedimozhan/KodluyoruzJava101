package Giris;
import java.util.Scanner;


public class PassTheClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        byte countOfLessons = 5;
        float average=0f;

        System.out.print("Please enter grade of your Mathematics : ");
        int mathGrade = input.nextInt();
        if(mathGrade>100 || mathGrade<0){
            countOfLessons--;
        }
        else{
            average += mathGrade;
        }
        System.out.print("Please enter grade of your Physic : ");
        int physicGrade = input.nextInt();
        if(physicGrade>100 || physicGrade<0){
            countOfLessons--;
        }
        else{
            average += physicGrade;
        }

        System.out.print("Please enter grade of your Turkish : ");
        int turkishGrade = input.nextInt();
        if(turkishGrade>100 || turkishGrade<0){
            countOfLessons--;
        }
        else{
            average += turkishGrade;
        }

        System.out.print("Please enter grade of your Chemistry : ");
        int chemistryGrade = input.nextInt();
        if(chemistryGrade>100 || chemistryGrade<0){
            countOfLessons--;
        }
        else{
            average += chemistryGrade;
        }

        System.out.print("Please enter grade of your Chemistry : ");
        int musicGrade = input.nextInt();
        if(musicGrade>100 || musicGrade<0){
            countOfLessons--;
        }
        else{
            average += musicGrade;
        }


        if(countOfLessons!=0){
            System.out.print("Teh average of lessons is : " + average/countOfLessons);
        }
        else{
            System.out.print("Error !");
        }





    }
}
