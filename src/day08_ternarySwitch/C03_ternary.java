package day08_ternarySwitch;

public class C03_ternary {
    public static void main(String[] args) {
        int a = 11;
        String sonuc=a%2==0 ? "cift sayi " : "tek sayi";

        String sonuc2= a>10 ? "buyuk sayi" : ""+2*a;
        System.out.println(a<10 ? "buyuk sayi" : 2*a);



    }
}
