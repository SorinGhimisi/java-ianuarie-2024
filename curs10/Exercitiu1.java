package curs10;

public class Exercitiu1 {
    public static void main(String[] args) {

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            if (i % 2 == 0) {
//                System.out.println("Am gasit numar par:" + i);
//                break;
//
//            }
//
//        }
//// EXEMPLU CONTINUE
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            if (i % 2 == 0) {
//                System.out.println("Am gasit numar par:" + i);
//                continue;
//            }
////            nu mai ajunge aici dupa continue
//            System.out.println("Am trecut de continue");

        for  (int index= 10; index >=0; index-- )

        {
            System.out.println(index);
            if (index == 3) {
                System.out.println("Indexul a ajuns la 3");
                break;
            }
        }
        }


    }
