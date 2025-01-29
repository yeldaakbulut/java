package day06_ifelseStatements;

import java.util.Scanner;

public class C07_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk= scan.next().charAt(0);
         if (krk>='a' && krk<='z'){
             System.out.println((char) (krk-32));

         }else {
             System.out.println(krk);
         }



    }
}
