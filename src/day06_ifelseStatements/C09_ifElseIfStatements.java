package day06_ifelseStatements;

public class C09_ifElseIfStatements {
    public static void main(String[] args) {
    char cinsiyet = 'E';
    int yas = 59;
    if (cinsiyet=='E' && yas>=65 ){
        System.out.println("emekli olabilirsin");

    } else if (cinsiyet=='E' && yas<65) {
        System.out.println("emekli olmak icin   " + (65-yas) + " sene calismalisin");



    } else if (cinsiyet=='K' &&  yas>=60) {
        System.out.println("emekli olabilirsin");


    } else if (cinsiyet=='K' && yas<60){
        System.out.println("emekli olmak icin " + (60-yas) + " sene calismalisin");

    }


    }
}
