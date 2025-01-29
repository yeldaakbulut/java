package day15_overloadingWhileLoop;

public class C07_RakamlarToplami {
    public static void main(String[] args) {

        int sayi= 1993;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi!=0){

            birlerBasamagi= sayi%10;
            rakamlarToplami +=birlerBasamagi;
            sayi /=10;

        }



        System.out.println(rakamlarToplami);



    }
}
