package day10_stringManipulation;

public class C10_IsEmpty {
    public static void main(String[] args) {


        String str="";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        str="  ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        str="x";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());




    }
}
