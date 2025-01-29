package day10_stringManipulation;

public class C07_soru {
    public static void main(String[] args) {
    String cumle="java cok guzeldir cok";
    String metin="Java";
    if (!cumle.contains(metin)){
        System.out.println("cumle metni icermiyor");
    }else{
        int ilkindex= cumle.indexOf(metin);
        int ikinciIndex= cumle.indexOf(metin, ilkindex+1);
        if (ikinciIndex==(-1)){
            System.out.println("cumle metni sadece bir kere iceriyor");

        }else {
            System.out.println("cumle metni birden fazla iceriyor");

        }
    }




    }
}
