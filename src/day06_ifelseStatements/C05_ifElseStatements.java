package day06_ifelseStatements;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();
        if (yas>=65){
            System.out.println("yasiniz emeklilik icin yeterli");

        }else {
            System.out.println("emekli olmak icin " + (65-yas) + " sene daha calismalisin");
        }

    }
}
