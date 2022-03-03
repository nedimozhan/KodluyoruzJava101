package Giris;

public class FrequencyOfElements {

    public static boolean isFind(int[] numbers,int[] frequency, int number){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == number && frequency[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] number = new int[arr.length];
        int[] frequency = new int[arr.length];
        int freq;
        int index = 0;


        for (int i = 0; i < arr.length-1; i++) {

            freq = 1;
            if(isFind(number,frequency,arr[i])==true){
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        freq++;
                    }
                }
                number[index] = arr[i];
                frequency[index] = freq;
                index++;
            }
        }

        if(isFind(number,frequency,arr[arr.length-1])==true){
            number[index] = arr[arr.length-1];
            frequency[index] = 1;
        }

        for (int i = 0; i < number.length; i++) {
            if(frequency[i]!=0){
                System.out.println("The number "+number[i] + " have repeated " + frequency[i] + " times");
            }
        }







    }

}
