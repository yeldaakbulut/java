package day09_stringManipulation;

public class C02_Equals {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";
        String str3= new String("Ali");
        String str4="Ali";
        System.out.println(str1==str2);
        System.out.println(str1==str4);
        System.out.println(str1.equals(str2));

        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));




    }



}
