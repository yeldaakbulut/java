package day04_matIslem_incrementDecrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki tane sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        int bolneSonucuTamsayi= (int) (sayi1/sayi2);


        System.out.println(bolneSonucuTamsayi);




    }
}
