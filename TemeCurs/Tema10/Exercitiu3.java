package TemeCurs.Tema10;

import java.util.Scanner;

public class Exercitiu3 {
    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul:");
        int numar = scanner.nextInt();
        switch (numar>100? 1:0){
            case 1:
                System.out.println("Numarul este mai mare decat 100.");
                break;
            case 2:
                System.out.println("Numarul este mai mic decat  100");
                break;
        }

    }
}
