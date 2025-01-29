package day02_dataturleri_scanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("isminiz : " + isim + "\nsoyisminiz : " + soyisim +
                "\nyasiniz : "+ yas +"\nKaydiniz basariyla tamamlanmistir.");

    }
}
