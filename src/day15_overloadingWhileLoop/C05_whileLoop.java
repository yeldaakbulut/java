package day15_overloadingWhileLoop;

import java.util.Scanner;

public class C05_whileLoop {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        boolean sifreGecerliMi= false;
        String sifre= "";
        int bayrak=0;

        while (sifreGecerliMi!=true){
            System.out.println("lutfen sifrenizi giriniz");
            sifre= scan.nextLine();
            bayrak=0;

            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
                System.out.println("sifrenin ilk karakteri kucuk harf olmali");
                bayrak++;
            }

            if (!(sifre.charAt(sifre.length()-1)>='0' &&  sifre.charAt(sifre.length()-1)<='9')){
                System.out.println("sifrenin sok karakteri sayi olmali");
                bayrak++;

            }
            if (bayrak==0){
                sifreGecerliMi=true;
                System.out.println("sifreniz basariyla kaydedildi");


            }
        }






    }
}
