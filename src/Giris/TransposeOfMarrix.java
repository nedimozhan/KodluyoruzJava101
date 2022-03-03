package Giris;
import java.util.Scanner;

public class TransposeOfMarrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter row : ");
        int row = scan.nextInt();

        System.out.print("Please enter col : ");
        int col = scan.nextInt();

        int[][] matrix = new int[row][col];


        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.println("Please enter number of element that row : " + i+" col : "+j);
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matrix : ");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }

        int[][] transposeOfMatrix = new int[col][row];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col; j++) {
                transposeOfMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose Matrix : ");
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j <row ; j++) {
                System.out.print(transposeOfMatrix[i][j]+" ");
            }
            System.out.print("\n");
        }


    }
}
