package day3_datacastingWrapperClass;

import java.util.Scanner;

public class C03_dataCasting {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        byte donusenSayi=(byte)girilenSayi;
        System.out.println("girdiginiz "   + girilenSayi + "'nin donusmus hali : " + donusenSayi);

    }


}
