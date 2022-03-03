package Giris;
import java.util.Scanner;

public class PalindromicWord {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Please enter a word : ");
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();

        if(isPalindrome(inp)==true){
            System.out.println("The word is a palindromic word");
        }
        else{
            System.out.println("The word is not a palindromic word");
        }
    }
}
