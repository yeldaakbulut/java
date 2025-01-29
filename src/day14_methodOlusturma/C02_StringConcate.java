package day14_methodOlusturma;

public class C02_StringConcate {
    public static void main(String[] args) {

        String str1= "java";
        String str2="candir";

        System.out.println(birlestirMethodu(str1,str2));
        System.out.println("java"+" "+"guzeldir");


    }
    public static String birlestirMethodu (String str1, String str2){
        return str1 + " " + str2;
    }


}
