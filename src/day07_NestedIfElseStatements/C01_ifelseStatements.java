package day07_NestedIfElseStatements;

import java.util.Scanner;

public class C01_ifelseStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak giriniz");
        double agirlik= scan.nextDouble();
        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble();
        double vke= (agirlik*10000 / (boy*boy));
        System.out.println("vucut kitle endeksiniz " + vke);
        if (vke>30){
            System.out.println("obez");

        } else if (vke>25) {
            System.out.println("kilolu");


        } else if (vke>20) {
            System.out.println("normal");

        }else if (vke>0){
            System.out.println("zayif");

        }else {
            System.out.println("yanlis giris");
        }


    }
}
