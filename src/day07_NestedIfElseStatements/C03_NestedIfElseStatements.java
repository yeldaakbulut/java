package day07_NestedIfElseStatements;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {
        char cinsiyet= 'e';
        int yas= 58;
        if (cinsiyet=='k' || cinsiyet=='K'){
            if (yas<15){
                System.out.println("hatali yas girisi");
            } else if (yas<60) {
                System.out.println("emekli olamazsin, daha " + (60-yas) + " sene calismalisin");

            }else {
                System.out.println("emekli olabilirsin");
        }

        } else if (cinsiyet=='e' || cinsiyet=='E') {
            if (yas<15){
                System.out.println("hatali yas girisi");

            } else if (yas<65) {
                System.out.println("emekli olmazsin, daha " + (65-yas)+ "sene daha calismalisin");




            }else {
                System.out.println("emekli olabilirsin");
            }


        }else {
            System.out.println("yanlis cinsiyet girisi");

        }

    }
}
