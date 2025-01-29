package day05_concatenation_operatorler;

public class C01_Concatenation {
    public static void main(String[] args) {

         String s1= "java";
         String s2= "guzeldir";
         String s3= "";
         String s4= " ";
         int sayi1= 4;
         int sayi2= 3;

         // java guzeldir12
        System.out.println(s1+s4+s2+s4+  (sayi1*sayi2));
         //2 java guzeldir

        System.out.println(sayi2/sayi1 + s4+s1+s4+s2 );
        //34 java
        System.out.println(s3+ sayi2+sayi1+s4+s1);
        //java7 guzeldir43

        System.out.println(s1+(sayi1+sayi2)+s4+s2+s3+ sayi1+sayi2);







    }
}
