package day06_ifelseStatements;

import java.util.Scanner;

public class C03_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin uc kenarini giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();
        if (kenar1==kenar2 && kenar3==kenar2){
            System.out.println("eskenar ucgen");
        }else {
            System.out.println("eskenar ucgen degil");

        }




    }
}
