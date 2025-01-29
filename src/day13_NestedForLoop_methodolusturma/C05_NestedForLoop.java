package day13_NestedForLoop_methodolusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {

     /*
     1
     12
     123
     1234
     12345
      */

        for (int i =1; i <=6 ; i++) {

            for (int j =1 ; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println("");
        }



    }
}
