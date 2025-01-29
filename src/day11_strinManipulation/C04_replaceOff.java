package day11_strinManipulation;

public class C04_replaceOff {
    public static void main(String[] args) {
        String input="jaù55*va1 c485ok9 gu::zel";
        input= input.replaceAll("\\d" , "");
        input=input.replaceAll(" " , "8");
        input=input.replaceAll("\\W" ,"");
        input=input.replaceAll("\\d", " ");





        System.out.println(input);





    }
}
