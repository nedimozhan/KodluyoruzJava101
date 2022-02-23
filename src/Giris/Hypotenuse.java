package Giris;
import java.util.Scanner;
public class Hypotenuse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first edge of triangle : ");
        double firstEdge = input.nextDouble();


        System.out.print("Please enter second edge of triangle : ");
        double secondEdge = input.nextDouble();


        System.out.print("Please enter first edge of triangle : ");
        double thirdEdge = input.nextDouble();

        double halfPerimeterOfTriangle = (firstEdge+secondEdge+thirdEdge)/2;
        double area = Math.sqrt(halfPerimeterOfTriangle * (halfPerimeterOfTriangle-firstEdge) * (halfPerimeterOfTriangle-secondEdge)*(halfPerimeterOfTriangle-thirdEdge));

        System.out.print(  "The area is : " + area );

    }


}
