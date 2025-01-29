package day08_ternarySwitch;

public class C04_ternary {
    public static void main(String[] args) {
       int sayi1= 10;
       int sayi2= 15;
       int sayi3= 12;

        System.out.println(sayi1==sayi2 && sayi2==sayi3 ? "eskenar ucgen" : "eskenar ucgen degil");


        int s1=10;
        int s2=12;
        System.out.println(s1>s2 ? s2 : s1);


          int kenar1= -10;
          if (kenar1>0){

              System.out.println(kenar1%2==0 ? "cift sayi" : "cift sayi degil");

          }else {
              System.out.println(kenar1<-99 && kenar1>-1000 ? "uc basamakli" : "uc basamakli degil");
              String sonuc = kenar1>0
                      ? kenar1%2==0 ? "cift sayi" : "cift sayi degil"
                      :
                      kenar1<-99 && kenar1<-10000 ? "uc basamakli" : "uc basamakli degil";




          }


    }
}
