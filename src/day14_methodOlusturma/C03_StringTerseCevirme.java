package day14_methodOlusturma;

public class C03_StringTerseCevirme {
    public static void main(String[] args) {

        String input= "Java kod yazdikca ogrenilir";

        System.out.println(stringitersCevir(input));

    }
    public static String stringitersCevir(String input){

        String tersStr= "";
        for (int i =input.length()-1; i >=0; i--) {
            tersStr=tersStr+ input.charAt(i);


        }
        return tersStr;
    }

}
