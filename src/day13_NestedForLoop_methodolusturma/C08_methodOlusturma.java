package day13_NestedForLoop_methodolusturma;

import java.util.Scanner;

public class C08_methodOlusturma {

    public static void main(String[] args) {
        isteToplaYazdir();
        isteToplaYazdir();



    }

    public  static void isteToplaYazdir(){
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen iki sayi girin");


        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("girilen sayilarin toplami : " + (sayi2+sayi1));



    }


}
