package day08_ternarySwitch;

public class C02_ternary {
    public static void main(String[] args) {
        String str1= "yelda";
        String str2= "yelda";
        if (str1.equals(str2)){
            System.out.println("metinler ayni");

        }else {
            System.out.println("metinler farkli");

        }
        System.out.println(str1.equals(str2) ? "metinler ayni" : "metinler farkli");




    }

}
