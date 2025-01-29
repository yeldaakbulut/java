package day3_datacastingWrapperClass;

import java.util.Scanner;

public class C03_ifstatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int s1= scan.nextInt();
        int s2= scan.nextInt();
        if (s1>100){
            System.out.println("ilk sayi 100'den buyuk");
            if (s2%2==0){
                System.out.println("ikinci sayi cift");
                if (s1>s2){
                    System.out.println("ilk sayi daha buyuk");

                }
            }
        }else {
            System.out.println("100 den kucuk");

        }







    }
}
