package Giris;
import java.util.Arrays;

public class FindDuplicate {

   public  static boolean isFind(int[] duplicate,int number){

       for (int i = 0; i < duplicate.length; i++) {
           if(number == duplicate[i]){
               return false;
           }
       }
       return true;
   }


    public static void main(String[] args) {
        int[] list = {2,2,3,3,2,9,10,21,1,2,8,8};
        int[] duplicate = new int[list.length];
        int indexOfDuplicate = 0;

        for (int i = 0; i < list.length-1; i++) {
            for (int j = i+1; j <list.length ; j++) {
                if(list[i] == list[j] && list[i]%2 == 0 && isFind(duplicate,list[i]) == true){
                    duplicate[indexOfDuplicate] = list[i];
                    indexOfDuplicate++;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));


    }
}
