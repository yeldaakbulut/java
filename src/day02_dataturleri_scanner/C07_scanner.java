package day02_dataturleri_scanner;

import java.util.Scanner;

public class C07_scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci tam sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen ikinci tam sayiyi giriniz");
        int sayi2= scan.nextInt();
        int bos;
        bos= sayi2;
        sayi2=sayi1;
        sayi1=bos;
        System.out.println("sayi1'in degeri : " + sayi1);
        System.out.println("sayi2'in degeri : " + sayi2);


    }





}
