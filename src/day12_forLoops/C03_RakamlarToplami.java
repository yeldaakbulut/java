package day12_forLoops;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
     int sayi= 1400000081;
     String sayiStr="" + sayi;
     int birlerBasamagi=0;
     int rakamlarToplami=0;

        for (int i = 1; i <=sayiStr.length(); i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami + birlerBasamagi;
            sayi=sayi/10;

        }
        System.out.println(rakamlarToplami);





    }
}
