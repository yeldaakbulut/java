package day06_ifelseStatements;

import java.util.Scanner;

public class C08_ifElseIfStatements {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin uc kenarini giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();
        if (kenar1<=0 || kenar2<=0 || kenar3<=0){
            System.out.println("gecersiz kenar uzunlugu");

        } else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("eskenar ucgen");


        }else {
            System.out.println("Eskenar ucgen degil");
        }


    }

}
