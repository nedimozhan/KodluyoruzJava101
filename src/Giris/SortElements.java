package Giris;
import java.util.Scanner;
import java.util.Arrays;
public class SortElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many number that you will enter : ");
        int n = scan.nextInt();
        int index=0;
        int[] arr = new int[n];
        int temp;

        //Fill the array
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter a number : ");
            arr[index]  = scan.nextInt();
            index++;
        }

        //Sort the array
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));






    }


}
