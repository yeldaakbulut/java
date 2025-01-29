package day07_NestedIfElseStatements;

import java.util.Scanner;

public class C04_nestedIfElseStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        double yas= scan.nextDouble();
        System.out.println("lutfen cinsiyetinizi giriniz E/K");
        char cinsiyet= scan.next().charAt(0);

        if (yas<15){
            System.out.println("hatali giris");



         } else if (yas<60) {
            System.out.println("emekli olamazsin");
            if (cinsiyet=='k'  ||  cinsiyet=='K'){
                System.out.println("emekli olamazsin, daha " + (60-yas)+ "sene calismalisin");

            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("emekli olamazsin, daha " + (65-yas) + "sene calismalisin");


            }else {
                System.out.println("hatali cinsiyet girisi");

            }

        } else if (yas<65) {
            if (cinsiyet=='k' || cinsiyet=='K'){
                System.out.println("emekli olabilirsin");

            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("emekli olamazsin, daha " + (65-yas) + " daha calismalisin");


            }else {
                System.out.println("hatali cinsiyet girisi");

            }

        }else {
            System.out.printf("emekli olabilirsin");
        }

    }
    }
