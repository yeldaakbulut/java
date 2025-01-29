package day12_forLoops;

public class C02_faktoryel {
    public static void main(String[] args) {
        int sayi= 10;
        int faktoryel= 1;

        for (int i =sayi; i >=1; i--) {

            faktoryel=faktoryel*i;

        }

        System.out.println(faktoryel);

    // 1 den 100 e kadar sayilar toplami

        int toplam=0;
        for (int i = 1; i <=100 ; i++) {
            toplam=toplam + i;

        }
        System.out.println(toplam);
    }
}
