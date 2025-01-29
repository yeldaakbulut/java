package day15_overloadingWhileLoop;

import java.util.Scanner;

public class C04_whileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double girilensayi=0;
        double toplamsayi=0;
        int sayac=0;

        while (toplamsayi<500){
            System.out.println("Toplanmak uzere sayi giriniz");

            girilensayi= scan.nextDouble();
            toplamsayi+=girilensayi;
            sayac++;

        }
        System.out.println("Girilen " + sayac + " sayinin toplami : " +toplamsayi + " oldu.Bu kadar yeter");



    }
}
