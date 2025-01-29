package day_16doWhileLoop;

public class C02_SifreKontrolu {

    public static void main(String[] args) {

        int input=143;
        int baslangic=1;
        int bayrak=0;



        do {
            if (baslangic*baslangic==input){

                System.out.println("true");
                bayrak++;
                break;
            }
            baslangic++;

        }while (baslangic*baslangic<=input);

        if (bayrak==0){
            System.out.println("false");
        }


    }
}
