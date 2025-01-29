package day11_strinManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

       String str1="";
        System.out.println(str1);
        System.out.println(str1.concat("java"));
        System.out.println(str1 + "");


        String str2="java candir";
        System.out.println(str2.concat("!"));

        String str3=null;
        System.out.println(str3);
        System.out.println(str3 + "java");


    }
}
