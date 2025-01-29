package day08_ternarySwitch;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi*2);

        }else {
            System.out.println(sayi+10);
        }

        System.out.println(sayi>0 ? 2*sayi : sayi+10);



    }
}
