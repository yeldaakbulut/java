package day12_forLoops;

public class C05_soru {
    public static void main(String[] args) {
      int sayi=120;
        for (int i =1; i <=130 ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print("fizzbuzz\n");
            } else if (i%3==0) {
                System.out.print("fizz");

            } else if (i%5==0) {
                System.out.print("buzz");


            }else {
                System.out.print(i+" ");

            }

        }



    }
}
