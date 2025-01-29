package day07_NestedIfElseStatements;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        int urunAdedi= 10;
        boolean kartVarMi=false;
        double listeFiyati= 12.5;
        double toplamFiyat=0;
        if (kartVarMi && urunAdedi>=10){
            toplamFiyat=urunAdedi*listeFiyati*(0.8);
            System.out.println(" %20 indirimli toplam fiyat : " + toplamFiyat);

        } else if (kartVarMi && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat=urunAdedi*listeFiyati*(0.85);
            System.out.println("%15 indirimli toplam fiyat " + toplamFiyat);


        } else if (!kartVarMi && urunAdedi>=10) {
            toplamFiyat=urunAdedi*listeFiyati*(0.85);
            System.out.println(" %15 indirimli toplam fiyat " + toplamFiyat);

        } else if (!kartVarMi && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat=urunAdedi*listeFiyati*(0.9);
            System.out.println(" %10 indirimli toplam fiyat " + toplamFiyat);


        }else {
            System.out.println("gecersiz giris");
        }


    }
}
