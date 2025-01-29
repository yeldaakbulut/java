package day04_matIslem_incrementDecrement;

import java.util.Scanner;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int input= scan.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;


        System.out.println("verilen sayinin rakamlar toplami : " + rakamlarToplami);



    }




}
