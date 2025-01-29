package day14_methodOlusturma;

public class C07_asalsayiKontrol {
    public static void main(String[] args) {

        int sayi=23;
        System.out.println(asalsayikontrolet(sayi));
        System.out.println(asalsayikontrolet(51));



    }
    public static String asalsayikontrolet(int sayi){

        String sonuc="";
        for (int i = 2; i <=(sayi-1) ; i++) {
            if (sayi%i==0){
                System.out.println("asal degil");
                break;
            }

        }
        if (!sonuc.equals("asal degil")){
            sonuc="asal";

        }
        return sonuc;

    }
}
