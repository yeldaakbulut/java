package day12_forLoops;

public class C04_dikkat {
    public static void main(String[] args) {
        int sayi=104;
        boolean bayrak= false;

        for (int i = 2; i <=sayi-1 ; i++) {
            if (sayi%i==0){
                bayrak=true;
                break;

            }

        }
        System.out.println(bayrak);
        if (bayrak){
            System.out.println("asal sayi");


        }else {
            System.out.println("asal sayi degil");
        }




    }
}
