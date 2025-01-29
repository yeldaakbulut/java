package day14_methodOlusturma;

public class C06_soru {
    public static void main(String[] args) {
          String isim="yelDA";
          String soyisim= "AKBULUT";

        System.out.println(isimspoyisimduzenleme(isim, soyisim));
        System.out.println(isimspoyisimduzenleme("kerem", "ceyda"));

    }
    public static String isimspoyisimduzenleme(String isim, String soyisim){

        String yeniisimSoyisim= isim.substring(0,1).toUpperCase()+
                                isim.substring(1).toLowerCase()+
                                " " +
                                 soyisim.substring(0,1).toUpperCase() +
                                 soyisim.substring(1).toLowerCase();
        return yeniisimSoyisim;
    }

}
