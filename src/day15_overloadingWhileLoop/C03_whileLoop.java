package day15_overloadingWhileLoop;

import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        int girilensayi=5;
        int sayac=0;
        int toplam=0;

        while (girilensayi !=0){
            System.out.println("Lutfen toplamak icin iki tamsayi giriniz" + "\nBitirmek icin 0 a basin");

            girilensayi= scan.nextInt();
            if (girilensayi!=0){
                sayac++;
                toplam=toplam+girilensayi;

            }
        }
        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);





    }
}
