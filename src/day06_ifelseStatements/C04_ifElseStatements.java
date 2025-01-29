package day06_ifelseStatements;

import java.util.Scanner;

public class C04_ifElseStatements {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk= scan.next().charAt(0);
        if (krk >='A' && krk <='Z'){
            System.out.println("buyuk harf");
        }else {
            System.out.println("buyk harf degil");
        }
    }
}
