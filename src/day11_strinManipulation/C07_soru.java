package day11_strinManipulation;

public class C07_soru {
    public static void main(String[] args) {

        String isim="ali";
        String soyisim="Har";
        String yeniisimsoyisim;

        if (isim.length()>soyisim.length()){
            yeniisimsoyisim=isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase()+
                            " " +
                             soyisim.substring(0,1).toUpperCase() +
                              soyisim.substring(1).toLowerCase();



        }else{
            yeniisimsoyisim=isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+
                    " " + soyisim.toUpperCase();
            System.out.println(yeniisimsoyisim);

        }


    }
}
