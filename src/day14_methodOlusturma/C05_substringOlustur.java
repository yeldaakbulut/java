package day14_methodOlusturma;

public class C05_substringOlustur {
    public static void main(String[] args) {
        String input="java ne kadar guzel";
        int basindex=5;
        int bitindex=7;


        kendiStringMethodumuz(input,basindex,bitindex);
        kendiStringMethodumuz("java", 1,3);
        kendiStringMethodumuz("deneme", 5, 9);
        kendiStringMethodumuz("yelda", 5, 2);


    }
    public static void kendiStringMethodumuz(String input, int basindex, int bitindex){

        if (basindex>bitindex){
            System.out.println("baslangic indexi bitis indexisinden buyuk olamaz");

        } else if (bitindex>=input.length()) {
            System.out.println("bitis indexi stringin sinirlari disinda");

        }else {
            for (int i = basindex; i <bitindex ; i++) {
                System.out.print(input.charAt(i));



            }
            System.out.println("");
        }
    }


}
