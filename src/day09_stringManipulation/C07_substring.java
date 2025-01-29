package day09_stringManipulation;

public class C07_substring {
    public static void main(String[] args) {
        String str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(5, 9));
        System.out.println(str.substring(9,30));
        String isim= "haSAN";
        isim=isim.substring(0,1).toUpperCase()+
            isim.substring(1).toLowerCase();
        System.out.println(isim);
        System.out.println(isim.substring(2,4));
        System.out.println(isim.substring(3,4));
        System.out.println("zor soru : " +  isim.substring(2,2));
        System.out.println(isim.substring(0,2));



    }
}
