package day02_dataturleri_scanner;


import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {

        //Kullanicidan ismini buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String kullaniciAdi= scan.next();
        System.out.println(kullaniciAdi.toUpperCase());


    }
}
