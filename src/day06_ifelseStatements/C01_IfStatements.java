package day06_ifelseStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ay isminin ilk harfini giriniz");
        char ilkHarf= scan.next().charAt(0);

        if (ilkHarf=='o' || ilkHarf=='O'){
            System.out.println("Ocak");


        }
        if (ilkHarf=='o' || ilkHarf=='O'){
            System.out.println("Ocak");
        }

        if (ilkHarf=='m' || ilkHarf=='M'){
            System.out.println("Mart veya Mayis");
        }

        if (ilkHarf=='k' || ilkHarf=='K'){
            System.out.println("kasim");
        }










    }
}
