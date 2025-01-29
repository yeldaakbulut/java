package day02_dataturleri_scanner;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin iki kenar uzunlugunu giriniz" +
                "\n iki kenar uzunlugu arasinda enter'a basiniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        System.out.println("dikdortgenin alani : " +(kenar1*kenar2));

    }
}
