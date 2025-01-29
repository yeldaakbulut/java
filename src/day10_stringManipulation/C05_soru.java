package day10_stringManipulation;

public class C05_soru {
    public static void main(String[] args) {

        String email= "yelda@gmail.com";
        if (!email.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");


        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");


        }else {
            System.out.println("email basariyla kaydedildi");
        }


    }
}
