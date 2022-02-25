package Giris;

public class PrimeNumbers {


    public static void main(String[] args) {
        System.out.print("Prime numbers between 0-100: ");


        boolean control=true;

        for (int i = 2; i <100; i++) {
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    control=false;
                    break;
                }
            }
            if(control==true){
                System.out.print(i+"\t");
            }
            control=true;
        }
    }
}
