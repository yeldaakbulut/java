package day10_stringManipulation;

public class C09_soru {
    public static void main(String[] args) {
        String cumle="java cok guzeldir cok";
        String metin= "j";

        int ilkIndex= cumle.indexOf(metin);
        int sonindex= cumle.lastIndexOf(metin);
        if (ilkIndex==(-1)){
            System.out.println("cumle metni icermiyor");

        } else if (ilkIndex==sonindex) {
            System.out.println("cumle metni sadece 1 kere iceriyor");

        }else {
            System.out.println("cumle metni birden fazla iceriyor");
        }


    }
}
