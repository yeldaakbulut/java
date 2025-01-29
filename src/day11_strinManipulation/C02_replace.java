package day11_strinManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String str="java candir";
        System.out.println(str.replace("candir", "cok guzeldir"));
        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace("java", "hava").
                replace("candir", "cok guzel"));
        System.out.println(str.replace("", "_"));
        System.out.println(str.replaceFirst("","_"));
        System.out.println(str.replaceFirst("a", "A" ));


    }
}
