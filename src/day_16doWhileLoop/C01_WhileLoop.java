package day_16doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // 10.11.12 sayilarini toplayan while loop yapin
        int sayi=10;
        int toplam=0;

        do {
            toplam=toplam+sayi;

            sayi++;

        }while (sayi<=12);

            System.out.println(toplam);





    }
}
