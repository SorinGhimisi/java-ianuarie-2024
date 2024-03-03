package TemeCurs.Tema11;
import java.util.Scanner;
public class Exercitiul2 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
        scanner.close();

    }
}
