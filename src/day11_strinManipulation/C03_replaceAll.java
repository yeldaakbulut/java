package day11_strinManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {

    String str="J2a12V2a Gu8z9e9ld5ir";
        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str.replaceAll("\\D", ""));

        String str1="ilk urun : 100 tl ";
        String str2= " ikinci urun : 150 tl ";

        str1=str1.replaceAll("\\D", "");
        str2=str2.replaceAll("\\D", "");
        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2 ) + " tl");





    }
}
