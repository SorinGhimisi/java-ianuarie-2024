package Teme8;

import java.util.Scanner;

public class Exercitiu3 {
    public static void main(String[] args) {
        System.out.println("Dati un numar:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
       System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("c=" +c);
        if (a>b){
            if (a>c){
                System.out.println(a);

            }else{
                System.out.println(c);

            }

        }else{
            if (b>c){
                System.out.println(b);

            }else{
                System.out.println(c);
            }
        }
    }
}