package day15_overloadingWhileLoop;

public class C06_soruWhileLoop {

    public static void main(String[] args) {

        int sayi=5;
        int us=8;
        usHesapla(sayi,us);

    }
    public static void usHesapla (int sayi, int us){

        int sonuc=1;

        while (us>0){
             sonuc *=sayi;
             us--;


        }System.out.println(sonuc);
    }

}
