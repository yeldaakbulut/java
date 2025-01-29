package day07_NestedIfElseStatements;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {
        int urunAdedi= 5;
        boolean kartVarMi=false;
        double listeFiyati= 29.99;
        double toplamFiyat=0;

        if (kartVarMi){
            if (urunAdedi<0){
                System.out.println("hatali urun girisi");

            } else if (urunAdedi<10) {
                toplamFiyat=urunAdedi*listeFiyati*0.85;
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);

            }else {
                toplamFiyat=urunAdedi*listeFiyati*0.80;
                System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);

            }

            } else {
            if (urunAdedi<0){
                System.out.println("hatali urun adedi girisi");


            } else if (urunAdedi<10) {
                toplamFiyat=urunAdedi*listeFiyati*0.90;
                System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat);


            }else{
                toplamFiyat=urunAdedi*listeFiyati*0.85;
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
            }
        }


    }
}
