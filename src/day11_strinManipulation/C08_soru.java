package day11_strinManipulation;

public class C08_soru {
    public static void main(String[] args) {

        String sifre= "nasilsinKardes";
        int bayrak=0;


        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            bayrak++;

        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            bayrak++;
        }
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            bayrak++;
        }
        if (!(sifre.length()>=10)){
            System.out.println("sifre en az 10 haneli olmali");
            bayrak++;

        }
        if (bayrak==0){
            System.out.println("sifreniz basariyla kaydedilmistir");


        }




    }
}
