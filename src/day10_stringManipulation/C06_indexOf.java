package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str= "Ahmet hoca ile her sey clear";
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("ile"));
        System.out.println(str.indexOf("e",18));
        int ilkindexc= str.indexOf("c");
        System.out.println(str.indexOf("c", ilkindexc+1));
        System.out.println(str.indexOf("ali"));





    }
}
