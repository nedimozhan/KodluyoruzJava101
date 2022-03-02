package Giris;

public class HarmonicAverage {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        float sum = 0f;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j <=numbers[i] ; j++) {
                sum += 1.0f/(float)j;
            }
        }

        System.out.println("Average of the Harmonics : " + (sum/numbers.length));
    }
}
