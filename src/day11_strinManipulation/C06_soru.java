package day11_strinManipulation;

public class C06_soru {
    public static void main(String[] args) {

        String cumle="eve geldim,meyve curuk";
        String cumlecopy= cumle.toLowerCase();

        if (cumlecopy.contains("ev") && cumlecopy.contains("is")){
            System.out.println("hem ev lazim hem is");

        } else if (cumlecopy.contains("ev")) {
            System.out.println("home home sweet home");


        } else if (cumlecopy.contains("is")) {
            System.out.println("calismak guzeldir");

        }else {
            System.out.println("cok calisman gerek");
        }

    }
}
