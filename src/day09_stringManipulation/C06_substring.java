package day09_stringManipulation;

public class C06_substring {
    public static void main(String[] args) {
          String str= "Java ogren, isi kap";
        System.out.println(str.length());
        System.out.println(str.substring(5));
        System.out.println(str.substring(0));
        String sonHarf= "" +str.charAt(str.length()-1);
        sonHarf= str.substring(str.length()-1);
        System.out.println(sonHarf);
        System.out.println(str.substring(str.length()-1).toUpperCase());
        System.out.println(str.substring(str.length()-3).toUpperCase());

    }
}
