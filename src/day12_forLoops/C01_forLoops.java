package day12_forLoops;

public class C01_forLoops {
    public static void main(String[] args) {

        for (int i = 10; i <100 ; i++) {
            if (i%7==0) System.out.print(i + ",");

            System.out.println(" ");

            for (int j = 10; j <15 ; j++) {
                System.out.print(j +",");

            }


        }
    }
}
