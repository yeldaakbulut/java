package day13_NestedForLoop_methodolusturma;

public class C02_stringTersineCevirme {
    public static void main(String[] args) {

        String input= "java her gecen gun guzellesiyor";
        String tersinput= "";

        for (int i = input.length()-1; i >=0 ; i--) {
            tersinput+= input.substring(i,i+1);

        }
        System.out.println("Ters hali : "+ tersinput);

    }
}
