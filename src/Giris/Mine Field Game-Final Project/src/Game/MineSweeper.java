package Game;
import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    char[][] Field;
    Scanner scan;
    int row;
    int col;
    int mineCount;
    int[][] minePositions;

    MineSweeper(){
        scan = new Scanner(System.in);
        System.out.print("Please enter row of the field : ");
        row = scan.nextInt();

        System.out.print("Please enter column of the field : ");
        col = scan.nextInt();

        Field = new char[row][col];
        mineCount = (row*col)/4;
        minePositions = new int[2][mineCount];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                Field[i][j] = '_';
            }
        }

        createRandomPosition();
        Play();

    }

    public void createRandomPosition(){

        Random rand = new Random();

        for (int i = 0; i < this.mineCount; i++) {
            minePositions[0][i] = rand.nextInt(row);
            minePositions[1][i] = rand.nextInt(col);
        }
    }

    public void Play(){

        System.out.println("Welcome to Mine Sweeper Game");

        int winCondition = (this.row*this.col)-this.mineCount;
        int enter_row;
        int enter_col;


        while(winCondition!=0){

            printField();

            while(true){
                System.out.print("Please enter row : ");
                enter_row = this.scan.nextInt();
                System.out.print("Please enter col : ");
                enter_col = this.scan.nextInt();

                if(enter_row >=row || enter_col>=col || enter_row <0 || enter_col < 0){
                    System.out.println("Please enter valid numbers !");
                }
                else{
                    break;
                }
            }

            // Game Over Check
            for (int i = 0; i < mineCount; i++) {
                if(this.minePositions[0][i] == enter_row && this.minePositions[1][i] == enter_col){
                    System.out.print("Game Over !");
                    return;
                }
            }

            int start_row = enter_row-1;
            int start_col = enter_col-1;
            int sum = 0;

            // Find how many mines near the entered point
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(start_row+i>=0 && start_row+i<row && start_col+j>=0 && start_col+j<col){
                        for (int k = 0; k < mineCount; k++) {
                            if(minePositions[0][k] == start_row+i && minePositions[1][k] == start_col+j){
                                sum++;
                                break;
                            }

                        }
                    }
                }
            }

            this.Field[enter_col][enter_row] = (char)(sum+'0');
            sum=0;
            winCondition--;
        }

        System.out.print("You Win !");
    }

    public void printField(){

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(this.Field[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }













}
