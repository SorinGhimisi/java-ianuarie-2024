package TemeCurs.Tema8;

import java.util.Scanner;

public class Exercitiu1 {
    public static void main(String[] args) {
        System.out.println("Dati un numar:");
        Scanner scanner=new Scanner(System.in);
        int numar=scanner.nextInt();
        if (numar>0){
            System.out.println("numkarul este pozitv");

        } else if (numar<0){
            System.out.println("numarul este negativ");

        } else {
            System.out.println("numarul este zero");
        }




    }

}
